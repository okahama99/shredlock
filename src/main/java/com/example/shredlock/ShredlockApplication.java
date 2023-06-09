package com.example.shredlock;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "PT5S", defaultLockAtLeastFor = "PT1S")
public class ShredlockApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShredlockApplication.class, args);
    }

}
