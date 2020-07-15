/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ae.smartek.hebh.chatAppRest;


import ae.smartek.hebh.chatAppRest.config.ListenerConfiguration;
import ae.smartek.hebh.chatAppRest.config.ProducerConfiguration;
import ae.smartek.hebh.chatAppRest.dto.ChatAppDTO;
import ae.smartek.hebh.chatAppRest.dto.ConsumerDTO;
import ae.smartek.hebh.chatAppRest.dto.ProducerDTO;
import ae.smartek.hebh.chatAppRest.service.ChatAppService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author houssem
 */
@Configuration
@ComponentScan("ae.smartek")
@Import({ListenerConfiguration.class,ProducerConfiguration.class})
public class AppConfig {
    @Bean
    public ChatAppService chatAppService() {
        return new ChatAppService();
    }
    @Bean
    public ChatAppDTO chatAppDTO() {
        return new ChatAppDTO();
    }
    @Bean
    public ProducerDTO producerDTO() {
        return new ProducerDTO();
    }
    @Bean
    public ConsumerDTO consumerDTO() {
        return new ConsumerDTO();
    }

}
