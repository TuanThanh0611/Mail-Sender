package com.Ivo.Mail.Service;

import com.Ivo.Mail.Model.MailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendMail(String mail, MailModel mailModel){

    }
}
