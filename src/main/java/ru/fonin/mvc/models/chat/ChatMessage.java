package ru.fonin.mvc.models.chat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
//import org.springframework.data.annotation.Id;
import javax.persistence.Id;
//import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "chatMessage")
public class ChatMessage {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private MessageType type;

    private String chatId;
    private String sender;
    private String recipientId;
    private String senderName;
    private String recipientName;
    private String content;
    private Date timestamp;
    private MessageStatus status;
}