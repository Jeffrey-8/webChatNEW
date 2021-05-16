package ru.fonin.mvc.controllers;

import lombok.experimental.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.fonin.mvc.models.chat.ChatMessage;
import ru.fonin.mvc.models.chat.ChatNotification;
//import ru.fonin.mvc.services.chat.ChatMessageService;
//import ru.fonin.mvc.services.chat.ChatRoomService;

@Controller
public class ChatController
{
//    @Autowired
    private SimpMessagingTemplate messagingTemplate;
//    @Autowired
//    private ChatMessageService chatMessageService;
//    @Autowired
//    private ChatRoomService chatRoomService;

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {

        return chatMessage;
    }



    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage,
                               SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }

//**********************************************************************************************************************************

//    @GetMapping("/messages/{senderId}/{recipientId}/count")
//    public ResponseEntity<Long> countNewMessages(
//            @PathVariable String senderId,
//            @PathVariable String recipientId) {
//
//        return ResponseEntity
//                .ok(chatMessageService.countNewMessages(senderId, recipientId));
//    }
//
//    @GetMapping("/messages/{senderId}/{recipientId}")
//    public ResponseEntity<?> findChatMessages ( @PathVariable String senderId,
//                                                @PathVariable String recipientId) {
//        return ResponseEntity
//                .ok(chatMessageService.findChatMessages(senderId, recipientId));
//    }

//    @GetMapping("/messages/{id}")
//    public ResponseEntity<?> findMessage ( @PathVariable String id) {
//        return ResponseEntity
//                .ok(chatMessageService.findById(id));
//    }
}
