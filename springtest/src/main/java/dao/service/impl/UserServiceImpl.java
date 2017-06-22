package dao.service.impl;

import dao.User;
import dao.UserDao;
import dao.service.Profiling;
import dao.service.UserService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 * Created by java on 16.06.2017.
 */
public class UserServiceImpl implements UserService, InitializingBean, DisposableBean {

    //String message;

    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserService constructor called 11");
        doMagic();
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("UserService afterPropertiesSet method called 22");
        doMagic();
    }
//
    public void destroy() throws Exception {
        System.out.println("UserService destroy method called");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void createUser(User user) {
        userDao.createUser(user);

    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);

    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    @Profiling
    public void doMagic(){
        System.out.println("UserService does magic");
    }


}
//bean factory
//@postcontract
//proxy object - копия нашего обьекта но с какой-то доп.функциональностью либо мы сами назначаем ему функциональность
//singleton