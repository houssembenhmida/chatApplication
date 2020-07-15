/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.chatAppRest.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author houssem
 */
@Configuration
public class ChatAppRestConfig {

public static String CHAT_APP_ENDPOINT;

    public ChatAppRestConfig() {
        getApplicationsEndpointsFromConfigFile();
    }



    private static void getApplicationsEndpointsFromConfigFile() {
        InputStream input = ChatAppRestConfig.class.getClassLoader().getResourceAsStream("config.properties");
        Properties config = new Properties();
        try {
            config.load(input);
            CHAT_APP_ENDPOINT="http://"+(String)config.get("chat_app_endpoint")+"/ws";
        } catch (IOException ex) {
            Logger.getLogger(ChatAppRestConfig.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
