package web.web;

import com.google.gson.Gson;
import web.entity.User;
import web.userDAO.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 25.05.2017.
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("search.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDAO userDAO = new UserDAO();

        String query = req.getParameter("query");
        String[] split = query.split(",");
        String queryLogin = split[0].trim();
        String queryPhone = split[1].trim();
        System.out.println("queryLogin: "+queryLogin);
        System.out.println("queryPhone: "+queryPhone);


        List<User> userList = userDAO.read();
        System.out.println(userList);

        resp.setContentType("application/json");

        PrintWriter out = resp.getWriter();
        Gson gson = new Gson();

        List a = filterListByQuery(userList, queryLogin, queryPhone);
        gson.toJson(a, out);

    }

    private List<User> filterListByQuery(List<User> userList, String queryLogin, String queryPhone) {
        List<User> result = new ArrayList<>();
        for (User u : userList){
            if (u.getLogin().contains(queryLogin)) {
                if (u.getPhone().contains(queryPhone)) result.add(u);
            }
            /*if (u.getLogin().contains(queryLogin)) {
                result.add(u);
            }*/
        }
        return result;
    }


}
