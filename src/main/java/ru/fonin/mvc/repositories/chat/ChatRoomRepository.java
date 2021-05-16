package ru.fonin.mvc.repositories.chat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fonin.mvc.models.chat.ChatRoom;

import java.util.Optional;

@Repository
public interface ChatRoomRepository extends JpaRepository<ChatRoom,String > {
    Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
