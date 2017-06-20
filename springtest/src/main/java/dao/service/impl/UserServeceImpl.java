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
public class UserServeceImpl implements UserService, InitializingBean, DisposableBean {

    String message;

    private UserDao userDao;

    public UserServeceImpl(String filePath) {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }

    public void afterPropertiesSet() throws Exception {
        doMagic();
        System.out.println("Init method after properties are set : " + message);
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
        return userDao.getUserByud(id);
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