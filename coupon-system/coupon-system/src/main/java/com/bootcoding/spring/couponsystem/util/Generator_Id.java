package com.bootcoding.spring.couponsystem.util;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;
//@Component
public class Generator_Id {
        public static String randomId(){
            // Random random =new Random();
            // 10 letter alphanumeric-coupon
            String s= UUID.randomUUID().toString();
            return  s;

        }

    }

