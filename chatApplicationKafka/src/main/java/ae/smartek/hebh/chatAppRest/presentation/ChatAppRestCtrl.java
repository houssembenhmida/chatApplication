/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.chatAppRest.presentation;

import ae.smartek.hebh.chatAppRest.model.Message;
import ae.smartek.hebh.chatAppRest.service.ChatAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author houssem
 */
@RestController
@RequestMapping("ws")
public class ChatAppRestCtrl {

    @Autowired
    private ChatAppService service;

    @PostMapping("/sendMessage")
    public void sendMessage(@RequestBody Message message) {
        service.sendMessage(message);
    }

}
