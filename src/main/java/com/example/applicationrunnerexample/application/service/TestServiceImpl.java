package com.example.applicationrunnerexample.application.service;

import com.example.applicationrunnerexample.application.repository.TableARepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "service", havingValue = "TestServiceImpl")
public class TestServiceImpl implements TestService {

    private final TableARepository tableARepository;

    // コンストラクタが１つの場合、@Autowiredは省略可能
    public TestServiceImpl(TableARepository tableARepository) {
        this.tableARepository = tableARepository;
    }

    @Override
    public String getYourName() {
        return tableARepository.selectByPrimaryKey("1").getValue();
    }
}
