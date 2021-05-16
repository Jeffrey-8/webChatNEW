package ru.fonin.mvc.services.chat;

import lombok.experimental.var;
import org.hibernate.Criteria;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import ru.fonin.mvc.models.chat.ChatMessage;
import ru.fonin.mvc.models.chat.MessageStatus;
//import ru.fonin.mvc.repositories.chat.ChatMessageRepository;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

//@Service
public class ChatMessageService {
//    @Autowired
//    private ChatMessageRepository repository;
//    @Autowired
//    private ChatRoomService chatRoomService;
//    @Autowired private MongoOperations mongoOperations;


//    public ChatMessage save(ChatMessage chatMessage) {
//        chatMessage.setStatus(MessageStatus.RECEIVED);
//        repository.save(chatMessage);
//        return chatMessage;
//    }
//
//    public long countNewMessages(String senderId, String recipientId) {
//        return repository.countBySenderIdAndRecipientIdAndStatus(
//                senderId, recipientId, MessageStatus.RECEIVED);
//    }

//    public List<ChatMessage> findChatMessages(String senderId, String recipientId) {
//        var chatId = chatRoomService.getChatId(senderId, recipientId, false);
//
//        var messages =
//                chatId.map(cId -> repository.findByChatId(cId)).orElse(new ArrayList<>());
//
//        if(messages.size() > 0) {
//            updateStatuses(senderId, recipientId, MessageStatus.DELIVERED);
//        }
//
//        return messages;
//    }

//    public ChatMessage findById(String id) {
//        return repository
//                .findById(id)
//                .map(chatMessage -> {
//                    chatMessage.setStatus(MessageStatus.DELIVERED);
//                    return repository.save(chatMessage);
//                })
//                .orElseThrow(() ->
//                        new ResourceNotFoundException("can't find message (" + id + ")"));
//    }

    //TODO: Done! обновить до MySQL
//    public void updateStatuses(String senderId, String recipientId, MessageStatus status) {
//            repository.updateStatus(senderId, recipientId, status);
//    }
}
