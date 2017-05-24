package web;



import dto.TargetData;
import entity.User;
import userDAO.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by Дмитрий on 18.05.2017.
 */
@WebServlet("/search")

public class SearchUsers extends HttpServlet {
    public UserDAO userDAO;
    public TargetData targetData=new TargetData();

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            List<TargetData> list = Arrays.asList(
                    new TargetData("user1@yopmail.com", "user1"),
                    new TargetData("user2@yopmail.com", "user2"),
                    new TargetData("user3@yopmail.com", "user3"),
                    new TargetData("user4@yopmail.com", "user4"),
                    new TargetData("user5@yopmail.com", "user5"),
                    new TargetData("user6@yopmail.com", "user6"),
                    new TargetData("user7@yopmail.com", "user7"),
                    new TargetData("user8@yopmail.com", "user8"),
                    new TargetData("user9@yopmail.com", "Вася"),
                    new TargetData("user10@yopmail.com", "user10"),
                    new TargetData("user11@yopmail.com", "user11")
            );

            String seachMail="user9@yopmail.com";
            String search="Вася";

            System.out.println(list.stream().filter(
                    targetData -> targetData.getEmail().equals(seachMail)
                            && targetData.getUserName().equals(search)).count());
            System.out.println("sfvf");



            System.out.println(list.stream().filter(
                    targetData -> targetData.getEmail().equals(seachMail)
                            && targetData.getUserName().equals(search)).toString());

            System.out.println(list.stream().filter(
                    targetData -> targetData.getEmail().equals(seachMail)
                            && targetData.getUserName().equals(search)).findFirst());

            String welSearch = null;

            System.out.println(welSearch= String.valueOf(list.stream().filter(
                    targetData -> targetData.getUserName().equals(search)).findFirst()));




            //System.out.println(list.stream().filter(search::equals).findFirst().orElseGet());
 /*           for (TargetData str :list){
                if (seachMail.contains(TargetData.))
            };*/



            req.setAttribute("well",welSearch);
            req.setAttribute("targetDataList", list);

            req.getRequestDispatcher("targetDataList.jsp").forward(req, resp);


    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
