package com.foodlie.demo.email_notification.entity;


import com.foodlie.demo.enums.NotificationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "notification")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;


    @NotBlank(message = "The recipient is required!")
    private String recipient;

    @Lob
    private String body;

    private NotificationType type;

    private boolean isHtml;

    private LocalDateTime createdAt=LocalDateTime.now();

}
