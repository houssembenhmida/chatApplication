/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.usersmanagementapp.config;

import ae.smartek.hebh.usersmanagementapp.dao.UserManagementDAO;
import ae.smartek.hebh.usersmanagementapp.service.UserManagementService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author houssem
 */
@Configuration
@ComponentScan("ae.smartek")
public class AppConfig {

    @Bean
    public UserManagementDAO userManagementDAO() {
        return new UserManagementDAO();
    }

    @Bean
    public UserManagementService userManagementService() {
        return new UserManagementService();
    }
}
