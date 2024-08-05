package com.Ivo.Mail.Controller;

import com.Ivo.Mail.Model.MailModel;
import com.Ivo.Mail.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;
    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailModel mailModel){
        mailService.sendMail(mail,mailModel);
        return "Successfully send the mail!!!";

    }
}
