package org.cfs.boot_Project_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    @Autowired
    private  MessageService messageService;

    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(){
        System.out.println(messageService.getMessage());
    }
}
