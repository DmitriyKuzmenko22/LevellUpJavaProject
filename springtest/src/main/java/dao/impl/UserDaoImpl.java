package dao.impl;

import dao.User;
import dao.UserDao;

import java.util.*;

/**
 * Created by java on 20.06.2017.
 */
public class UserDaoImpl implements UserDao {

    private Map<Long,User> userByIdMap =new HashMap<>(); // nawa baza dannih
    private Map<String,Long> idByEmailMap= new HashMap<>(); // nawa baza dannih

   /* public void init(){
        List<User> users= Arrays.asList(new User(1L,"user1@yopmai.com","Jonh","Doe"),
                new User(2L,"user1@yopmai.com","Bob","Does"),
                new User(3L,"user1@yopmai.com","Tom","Potter"),
                new User(4L,"user1@yopmai.com","Harry","Flotter"),
                new User(5L,"user1@yopmai.com","Donald","Trump"),
                new User(6L,"user1@yopmai.com","Sara","Connor")
        );*/

    /*    Random random=new Random();

        for (User u: users){
            u.increaseBalance(random.nextInt(100)+25);

            createUser(u);
        }
    }*/

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userByIdMap.values();
    }


    @Override
    public User getUserByEmail(String email) {
       Long userId= idByEmailMap.get(email);
        return userByIdMap.get(userId);
    }

    @Override
    public User getUserById(Long id) {
        return userByIdMap.get(id);
    }

    @Override
    public void createUser(User user) {
       /* userByIdMap.put(user.getId(),user);
        idByEmailMap.put(user.getEmail(),user.getId());*/
    }
//
    @Override
    public void deleteUser(User user) {
     /*   userByIdMap.remove(user.getId());
        idByEmailMap.remove(user.getEmail());*/

    }

    @Override
    public void updateUser(User user) {
       /* userByIdMap.put(user.getId(),user);
        idByEmailMap.put(user.getEmail(),user.getId());*/
    }
}
