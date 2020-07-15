/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.chatAppRest.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author houssem
 */
@Component
public class ChatAppDTO {

    @Autowired
    private ProducerDTO producer;

    public void sendMessage(String key, String message) {
        producer.sendMessage(key, message);
    }

}
