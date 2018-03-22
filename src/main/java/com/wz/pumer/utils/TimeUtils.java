package com.wz.pumer.utils;

public class TimeUtils {

    //获取时间戳
    public static int getCurrentTime(){
        Long currentTimeMillis= System.currentTimeMillis();
        return currentTimeMillis.intValue();
    }


}
