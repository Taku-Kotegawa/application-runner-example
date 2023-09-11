package com.example.applicationrunnerexample.application.batch;

import com.example.applicationrunnerexample.application.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestRunner01 implements ApplicationRunner {

    private final TestService testService;

    @Autowired
    public TestRunner01(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("hello world.");
        for (String x : args.getNonOptionArgs()) {
            log.info("args: ");
            log.info("  " + x);
        }

        log.info("YourName = {}", testService.getYourName());

        // 強制的に例外発生
        // throw new RuntimeException("error");
    }
}
