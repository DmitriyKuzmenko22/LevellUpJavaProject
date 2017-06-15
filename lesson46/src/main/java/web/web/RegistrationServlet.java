package web.web;

import com.google.gson.Gson;
import web.entity.User;
import web.sender.EmailConsumer;
import web.sender.EmailMessage;
import web.sender.EmailProducer;
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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by java on 23.05.2017.
 */
@WebServlet("/user/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../pages/user/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Access-Control-Allow-Origin", "*");

        UserDAO userDAO=new UserDAO();

        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmationPassword = req.getParameter("password_confirm");
        String userRole = req.getParameter("role");
        String lang = req.getParameter("lang");
        String name="ivan";
        String lastName="ivanov";
        String phone="380997859394";


        System.out.println("login = " + login);
        System.out.println("email = " + email);
        System.out.println("password = " + password);
        System.out.println("confirmationPassword = " + confirmationPassword);
        System.out.println("userRole = " + userRole);
        System.out.println("lang = " + lang);


        String symbols = "qwertyuioplkjhgfdsa123456789";
        StringBuilder randString = new StringBuilder();
        int count = (int)(Math.random()*40);
        for(int i=0;i<count;i++)
            randString.append(symbols.charAt((int)(Math.random()*symbols.length())));

        System.out.println(randString);

        String urlVerif="http://localhost:8080/user/verif?"+randString;
        User user=new User(login,name,lastName,phone,email,randString.toString());

        userDAO.addUser(user);

        String textRegis="Для подтверждения жмакните ссылку: \n\r"+urlVerif;

        EmailMessage emailMessage=new EmailMessage(email,textRegis,"подтверждение эмейла");
        List<EmailMessage> list=new ArrayList<>();
        list.add(emailMessage);
        ArrayBlockingQueue<EmailMessage> queue=new ArrayBlockingQueue<EmailMessage>(10);
        EmailProducer emailProducer=new EmailProducer(queue);
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        executorService.execute(new EmailConsumer(queue));
        executorService.execute(new EmailConsumer(queue));
        executorService.execute(new EmailConsumer(queue));
        emailProducer.sendMessage(list);

       // UserDAO userDAO = new UserDAO();

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





