package web.web;



import web.entity.User;
import web.userDAO.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Дмитрий on 14.05.2017.
 */
@WebServlet("/registration")
public class RegistrationServeletMy  extends HttpServlet {
    public UserDAO userDAO;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("registrationTwo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req);
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");

        UserDAO userDAO = new UserDAO();
        if (login.equals("") || password.equals("") || name.equals("") || lastName.equals("")) {
            doGet(req,resp);
        } else {
            req.setAttribute("name", name);
            req.setAttribute("lastName", lastName);
            User user = new User(login,name,lastName,phone,email);
            System.out.println(user.toString());

            userDAO.addUser(user);


            req.getRequestDispatcher("userPage.jsp").forward(req, resp);
        }
    }


        /*  System.out.println(req);

        if (req.getParameter("RegisButton") != null) {
            req.getRequestDispatcher("registrationTwo.jsp").forward(req, resp);
        }

        String login = req.getParameter("login");
        String pass = req.getParameter("password");
        String date = req.getParameter("dateBirth");

        if (req.getParameter("LoginButton") != null) {
            req.setAttribute("userName", login);
            req.setAttribute("password", pass);
            req.setAttribute("birthDate", date);
            req.getRequestDispatcher("completeRegis.jsp").forward(req, resp);
        }
        }*/
    }

