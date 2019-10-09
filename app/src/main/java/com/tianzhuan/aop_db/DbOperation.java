package com.tianzhuan.aop_db;

public interface DbOperation {
    void insert();

    void delete();

    void update();
    //数据备份
    void save();
}
