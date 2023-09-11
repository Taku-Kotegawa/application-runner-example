package com.example.applicationrunnerexample.application.repository;

import com.example.applicationrunnerexample.domain.model.TableA;

public interface TableARepository {

    /**
     * 主キーで検索
     *
     * @param code 主キー
     * @return 検索に合致したオブジェクト、存在しない場合はnull
     */
    TableA selectByPrimaryKey(String code);
}
