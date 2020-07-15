/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.usersmanagementapp.dao;

import ae.smartek.hebh.usersmanagementapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author houssem
 */
public interface UserManagementRepository extends MongoRepository<User, String>{
    User findUserByUserName(String userName);
}
