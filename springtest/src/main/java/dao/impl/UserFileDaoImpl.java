package dao.impl;

import dao.User;
import dao.UserDao;

import java.io.*;
import java.util.List;

/**
 * Created by java on 20.06.2017.
 */
public class UserFileDaoImpl implements UserDao {

//
    private final String filePath;

    public UserFileDaoImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<User> getAllUsers() {
        File file=new File(filePath);
        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
