package com.bootcoding.spring.couponsystem.util;

import java.util.Random;

public class RandomBoolean {
    public static boolean randomBoolean(){
        Random random=new Random();
        boolean rando=random.nextBoolean();
        return rando;
    }
}
