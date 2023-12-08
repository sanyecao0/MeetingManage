package com.meetingmanage.Utils;

import java.util.Random;

public class RandomUtils {
    /*
     * 返回长度为【strLength】的随机数，在前面补0
     */
   public static Integer getFixLengthCount() {

        Random rm = new Random();
        // 获得随机数
        Integer pross =rm.nextInt(9000000) + 1000000;
        // 返回固定的长度的随机数
        return pross;
    }
}
