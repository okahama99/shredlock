package com.example.shredlock;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class BaeldungTaskScheduler {

    @Scheduled(cron = "1 * * * * *")
    @SchedulerLock(name = "Test_Lock_1_minute", lockAtLeastFor = "PT2S")
    public void scheduledTask() {
    }
}
