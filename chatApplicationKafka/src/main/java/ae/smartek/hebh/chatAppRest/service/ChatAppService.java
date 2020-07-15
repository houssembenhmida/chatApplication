/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.chatAppRest.service;

import ae.smartek.hebh.chatAppRest.dto.ChatAppDTO;
import ae.smartek.hebh.chatAppRest.model.Message;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *
 * @author houssem
 */
@Service
@Scope(value = "singleton")
public class ChatAppService {

    @Autowired
    ChatAppDTO dto;

    public void sendMessage(Message message) {
        String key = message.getFrom() + " | " + message.getTo();
        String messageText = message.getMessageText();
        dto.sendMessage(key, messageText);
    }

}
