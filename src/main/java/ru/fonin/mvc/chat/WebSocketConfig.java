//package ru.fonin.mvc.chat;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//
//import java.util.List;
//
//@Configuration
//public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
//
//    @Override
//    public void configureMessageBroker(org.springframework.messaging.simp.config.MessageBrokerRegistry messageBrokerRegistry) {
//        config.enableSimpleBroker( "/user");
//        config.setApplicationDestinationPrefixes("/app");
//        config.setUserDestinationPrefix("/user");
//
//    }
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
//
//    }
//
//    @Override
//    public boolean configureMessageConverters(List<org.springframework.messaging.converter.MessageConverter> list) {
//        return false;
//    }
//
//}
