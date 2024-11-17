package com.example.demo.Service;

import com.example.demo.Entity.MESSAGES;
import com.example.demo.Repository.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesService {
    @Autowired
    private MessagesRepository messagesRepository;

    public MESSAGES createMessage(String message){
        MESSAGES n = new MESSAGES();
        n.setMessage(message);
        n.setCreated_at();
        n.setUpdated_at();
        return messagesRepository.save(n);
    }
}
