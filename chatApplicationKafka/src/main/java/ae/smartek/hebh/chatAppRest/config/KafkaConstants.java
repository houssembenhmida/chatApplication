/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.chatAppRest.config;

import ae.smartek.hebh.chatAppRest.dto.ChatAppDTO;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author houssem
 */
public class KafkaConstants {

    public static String MESSAGES_TOPIC = "chatApp_messages";
    public static String GROUP_ID = "chatAppRest2";
    public static String KAFKA_BROKERS = getBrokersFromConfigFile();

    private static String getBrokersFromConfigFile() {
        InputStream input = ChatAppDTO.class.getClassLoader().getResourceAsStream("config.properties");

        Properties config = new Properties();

        try {
            config.load(input);
            return (String) config.get("confluent_brokers");
        } catch (IOException ex) {
            Logger.getLogger(ChatAppDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
