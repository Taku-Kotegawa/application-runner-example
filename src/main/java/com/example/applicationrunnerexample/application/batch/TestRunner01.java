package com.example.applicationrunnerexample.application.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestRunner01 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("hello world.");
        for (String x : args.getNonOptionArgs()) {
            log.info("args: ");
            log.info(x);
        }

        // 強制的に例外発生
        // throw new RuntimeException("error");
    }
}
