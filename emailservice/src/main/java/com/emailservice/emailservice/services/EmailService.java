package com.emailservice.emailservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.emailservice.emailservice.models.EmailDetails;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public String sendMail(EmailDetails details) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(details.getEmail());
        mailMessage.setSubject("Contato: " + details.getName());
        mailMessage.setText(details.getText());
        javaMailSender.send(mailMessage);
        return "Email enviado com sucesso!";
    }
}
