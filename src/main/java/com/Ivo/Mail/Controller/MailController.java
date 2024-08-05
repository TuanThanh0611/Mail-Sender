package com.Ivo.Mail.Controller;

import com.Ivo.Mail.Model.MailModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {
    public String sendMail(@PathVariable String mail, @RequestBody MailModel mailModel){


    }
}
