package com.bootcoding.spring.couponsystem.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.UUID.randomUUID;

@Component

public class CouponHelper {

    public int newCoupon(){
        int uu= Integer.parseInt(UUID.randomUUID().toString());
        return uu;
    }

}
