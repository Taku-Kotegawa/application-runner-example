package com.example.applicationrunnerexample.application.repository;

import com.example.applicationrunnerexample.domain.model.TableA;
import org.springframework.stereotype.Repository;

/**
 * テーブルからの取得をシミュレート
 */
@Repository
public class TableARepositoryMockImpl implements TableARepository {
    @Override
    public TableA selectByPrimaryKey(String code) {
        return switch (code) {
            case "1" -> new TableA("1", "nanashi no gonbe");
            case "2" -> new TableA("2", "test test test");
            default -> null;
        };
    }
}
