package com.example.demo.Controller;

import com.example.demo.Entity.MESSAGES;
import com.example.demo.Service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class MessagesController {
    @Autowired
    private MessagesService messagesService;

    @PostMapping(path="/message")
    public @ResponseBody String addNewMessage(@RequestParam String message){
        try{
            messagesService.createMessage(message);
            return "New message added";
        }catch (Exception e){
            return "Error :" + e.getMessage();
        }
    }
}
