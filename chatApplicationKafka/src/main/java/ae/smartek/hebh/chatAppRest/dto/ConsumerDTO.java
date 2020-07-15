/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.chatAppRest.dto;


import ae.smartek.hebh.chatAppRest.config.ChatAppRestConfig;
import ae.smartek.hebh.chatAppRest.model.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author houssem
 */
@Component
public class ConsumerDTO {

 RestTemplate restTemplate;

    public ConsumerDTO() {
        restTemplate = new RestTemplate();
    }

    @KafkaListener(topics = "chatApp_messages")
    public void consumeMessages(ConsumerRecord<String, String> record) {
         String key = record.key();
        String value = record.value();
        String[] users = key.split("\\|");
        users[0] = users[0].trim();
        users[1] = users[1].trim();
        Message msg = new Message();
        msg.setFrom(users[0]);
        msg.setTo(users[1]);
        msg.setMessageText(value);
        msg.setTimeStamp(record.timestamp());
  
        restTemplate.postForObject(ChatAppRestConfig.CHAT_APP_ENDPOINT+"/receiveMessage", msg, Message.class);

    }

}
