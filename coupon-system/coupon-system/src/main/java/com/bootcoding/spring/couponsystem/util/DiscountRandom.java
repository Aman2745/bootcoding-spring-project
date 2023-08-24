package com.bootcoding.spring.couponsystem.util;

import java.util.Random;

public class DiscountRandom {
    public static int discountRandom(){
        Random random=new Random();
       return 10+random.nextInt()*50;
    }
}
