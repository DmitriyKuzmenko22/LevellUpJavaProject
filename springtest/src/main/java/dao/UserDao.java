package dao;

import java.util.List;

/**
 * Created by java on 20.06.2017.
 */
public interface UserDao {

    List<User> getAllUsers();

    User getUserByEmail(String email);

    User getUserById(Long id);

    void createUser(User user);

    void deleteUser(User user);
//
    void updateUser(User user);
}
