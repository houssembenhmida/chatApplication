/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.usersmanagementapp.presentation;

import ae.smartek.hebh.usersmanagementapp.model.User;
import ae.smartek.hebh.usersmanagementapp.service.UserManagementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author houssem
 */
@RestController
@RequestMapping("ws")
public class UserManagementController {

    @Autowired
    private UserManagementService service;

    @GetMapping("/getUserByUserName")
    public User getUserByUserName(@RequestParam String userName) {
        return service.getUserByUserName(userName);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        service.addUser(user);
    }
}
