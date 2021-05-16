package ru.fonin.mvc.repositories.chat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.fonin.mvc.models.chat.ChatMessage;
import ru.fonin.mvc.models.chat.MessageStatus;

import java.util.List;

//@Repository
//public interface ChatMessageRepository extends JpaRepository<ChatMessage,String> {
//
//    long countBySenderIdAndRecipientIdAndStatus(
//            String senderId, String recipientId, MessageStatus status);
//
//    List<ChatMessage> findByChatId(String chatId);
//
////    ChatMessage findByyI
//
////    @Modifying
////    @Query("update ChatMessage cm set cm.status = ?3 where cm.senderId = ?1 and cm.recipientId=?2")
////    void updateStatus(String senderId, String recipientId, MessageStatus status);
//
//}
