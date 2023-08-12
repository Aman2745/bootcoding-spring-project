package com.bootcoding.spring.couponsystem.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component

public class CouponHelper {

    public String newCoupon(){
        return UUID.randomUUID().toString();
    }

}
