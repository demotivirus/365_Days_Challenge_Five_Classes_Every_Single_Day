package com.demotivirus.Day_017_S2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class TestAround {
    private static Logger logger = Logger.getLogger(TestAround.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        FortuneService fortuneService = (FortuneService) context.getBean("fortuneService");
        logger.info("START");
        logger.info(fortuneService.getFortune());
        logger.info("FINISH");

        logger.info(fortuneService.getFortune(true));
    }
}
