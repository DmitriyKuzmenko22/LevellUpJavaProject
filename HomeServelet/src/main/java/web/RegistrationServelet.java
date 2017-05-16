package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Дмитрий on 14.05.2017.
 */
public class RegistrationServelet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("startPage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req);

        if (req.getParameter("RegisButton") != null) {
            req.getRequestDispatcher("registration.jsp").forward(req, resp);
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
        }
    }

