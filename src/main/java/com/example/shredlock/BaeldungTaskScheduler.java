package com.example.shredlock;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Component
public class BaeldungTaskScheduler {
    private static final Logger logger = LogManager.getLogger(BaeldungTaskScheduler.class);

    @Scheduled(cron = "30 * * * * ?")
    @SchedulerLock(name = "TaskScheduler_scheduledTask",
            lockAtLeastFor = "PT5M", lockAtMostFor = "PT14M")
    public void scheduledTask() {
        logger.debug("test");
    }
}
