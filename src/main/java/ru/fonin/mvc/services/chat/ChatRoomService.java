package ru.fonin.mvc.services.chat;

//import lombok.experimental.var;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import ru.fonin.mvc.models.chat.ChatRoom;
//import ru.fonin.mvc.repositories.chat.ChatRoomRepository;

//import java.util.Map;
//import java.util.Optional;

//import static com.sun.tools.doclint.Entity.or;



//@Service
//public class ChatRoomService {
//
//    @Autowired private ChatRoomRepository chatRoomRepository;
//
//    public Optional<String> getChatId(
//            String senderId, String recipientId, boolean createIfNotExist) {
//
//                ChatRoom chatRoom= chatRoomRepository.findBySenderIdAndRecipientId(senderId, recipientId).get();
//
//                if(!createIfNotExist) {
//                    return  Optional.empty();
//                }
//
//        var chatId =
//                String.format("%s_%s", senderId, recipientId);
//
//        ChatRoom senderRecipient = ChatRoom
//                .builder()
//                .chatId(chatId)
//                .senderId(senderId)
//                .recipientId(recipientId)
//                .build();
//
//        ChatRoom recipientSender = ChatRoom
//                .builder()
//                .chatId(chatId)
//                .senderId(recipientId)
//                .recipientId(senderId)
//                .build();
//        chatRoomRepository.save(senderRecipient);
//        chatRoomRepository.save(recipientSender);
//
//        return Optional.of(chatId);
//
//
//

//        return chatRoomRepository
//                .findBySenderIdAndRecipientId(senderId, recipientId)
//                .map(ChatRoom::getChatId)
//                .or(() -> {
//                    if(!createIfNotExist) {
//                        return  Optional.empty();
//                    }
//                    var chatId =
//                            String.format("%s_%s", senderId, recipientId);
//
//                    ChatRoom senderRecipient = ChatRoom
//                            .builder()
//                            .chatId(chatId)
//                            .senderId(senderId)
//                            .recipientId(recipientId)
//                            .build();
//
//                    ChatRoom recipientSender = ChatRoom
//                            .builder()
//                            .chatId(chatId)
//                            .senderId(recipientId)
//                            .recipientId(senderId)
//                            .build();
//                    chatRoomRepository.save(senderRecipient);
//                    chatRoomRepository.save(recipientSender);
//
//                    return Optional.of(chatId);
//                });
//    }
//}