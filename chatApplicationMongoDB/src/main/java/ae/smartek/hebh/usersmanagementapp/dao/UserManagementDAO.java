/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.usersmanagementapp.dao;

import ae.smartek.hebh.usersmanagementapp.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author houssem
 */
public class UserManagementDAO {

    @Autowired
    private UserManagementRepository repository;

    public User getUserByUserName(String userName) {
        return repository.findUserByUserName(userName);
    }
    
    public List<User>getAllUsers(){
        return repository.findAll();
    }
    
    public void addUser(User user){
        repository.save(user);
    }

}
