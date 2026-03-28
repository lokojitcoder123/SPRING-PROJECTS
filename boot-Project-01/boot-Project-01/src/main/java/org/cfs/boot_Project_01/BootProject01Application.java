package org.cfs.boot_Project_01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProject01Application implements CommandLineRunner {

	private final Notification notification;

	public BootProject01Application(Notification notification){
		this.notification=notification;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootProject01Application.class, args);
	}

	@Override
	public void run(String... args){
		notification.notifyUser();
	}
}
