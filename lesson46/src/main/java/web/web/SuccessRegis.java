package web.web;

import web.entity.User;
import web.userDAO.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Дмитрий on 29.05.2017.
 */
@WebServlet("/user/verif")
public class SuccessRegis extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDAO userDAO=new UserDAO();
        List<User> list=userDAO.read();

        System.out.println(req.getQueryString());
        for (User user :
                list) {
            if (user.getVerif_key().equals(req.getQueryString())){
                user.setAccess_key(true);
                userDAO.update(user);
                System.out.println(true);
            }
        }
        resp.sendRedirect("/http://localhost:8080/login");
    }
}
