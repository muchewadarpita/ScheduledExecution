package com.example.ScheduledExecution;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Scheduled(fixedDelay = 5000) // Executes every 5 seconds
    public void doSomethingScheduled() {
        System.out.println("This method executed periodically after every 5 seconds.");
    }
}
