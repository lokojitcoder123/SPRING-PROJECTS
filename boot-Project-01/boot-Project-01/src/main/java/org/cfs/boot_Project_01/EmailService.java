package org.cfs.boot_Project_01;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Email: you have got new message!";
    }

}
