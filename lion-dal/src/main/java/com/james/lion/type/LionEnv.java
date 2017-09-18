package com.james.lion.type;

/**
 * Created by james.li on 2015-03-24 09:50:41.
 */
public enum LionEnv {
    DEVELOP(1),             //开发环境
    ARK(2),               //ark环境
    PPE(3),                 //全仿真环境
    ONLINE(4),              //线上环境
    PERFORMANCE(5);         //性能环境

    public final int value;

    private LionEnv(int value) {
        this.value = value;
    }
}
