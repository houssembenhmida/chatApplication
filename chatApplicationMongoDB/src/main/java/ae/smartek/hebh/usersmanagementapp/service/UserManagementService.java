/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.usersmanagementapp.service;

import ae.smartek.hebh.usersmanagementapp.dao.UserManagementDAO;
import ae.smartek.hebh.usersmanagementapp.model.User;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author houssem
 */
@Service
public class UserManagementService {

    @Autowired
    private UserManagementDAO dao;
//    List<User> userList;

//    public UserManagementService() {
//        userList = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            User u = new User();
//            u.setId(Integer.toString(i));
//            String ch = "test" + u.getId();
//            u.setUserName(ch);
//            u.setFirstName(ch);
//            u.setLastName(ch);
//            userList.add(u);
//
//        }
//    }
//
//    public User getUserByUserName(String userName) {
//        for (User user : userList) {
//            if(user.getUserName().equals(userName)){
//                return user;
//            }
//        }
//        return null;
//    }
//
//    public List<User> getAllUsers() {
//        return userList;
//    }
//
//    public void addUser(User user) {
//       userList.add(user);
//    }

    public User getUserByUserName(String userName) {
        return dao.getUserByUserName(userName);
    }
    
    public List<User>getAllUsers(){
        return dao.getAllUsers();
    }
    
    public void addUser(User user){
        dao.addUser(user);
    }
}
