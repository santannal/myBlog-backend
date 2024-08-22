package com.emailservice.emailservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.emailservice.emailservice.models.EmailDetails;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public String sendMail(EmailDetails details) {
        try {

            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

            helper.setTo("leonardosantanna@outlook.com.br");
            helper.setFrom("testejaksjkajksdjk@outlook.com");
            helper.setSubject("Contato: " + details.getName());

            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo("leonardosantanna@outlook.com.br"); // Destinatário
            mailMessage.setFrom("testejaksjkajksdjk@outlook.com");
            mailMessage.setSubject("Contato: " + details.getName());
            mailMessage.setText(
                    "Nome: " + details.getName() + "\nEmail: " + details.getEmail() + "\nMensagem: "
                            + details.getText());
            javaMailSender.send(mailMessage);
            return "Email enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email: " + e.getMessage();
        }
    }
}
