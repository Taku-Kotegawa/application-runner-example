package com.example.applicationrunnerexample.application.service;

import com.example.applicationrunnerexample.application.repository.TableARepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "service", havingValue = "TestServiceImpl2")
public class TestServiceImpl2 implements TestService {

    private final TableARepository tableARepository;

    // コンストラクタが１つの場合、@Autowiredは省略可能
    public TestServiceImpl2(TableARepository tableARepository) {
        this.tableARepository = tableARepository;
    }

    @Override
    public String getYourName() {
        return tableARepository.selectByPrimaryKey("2").getValue();
    }
}
