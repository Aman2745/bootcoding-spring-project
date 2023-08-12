package com.bootcoding.spring.couponsystem.service;

import com.bootcoding.spring.couponsystem.helper.CouponHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class CouponService {
    //dependency inject
    @Autowired
    private CouponHelper couponHelper=null;
    public String getNewCoupon(){

        return couponHelper.newCoupon();
    }
    public List<String> getNewCoupon(int quantity) {
        List<String> coupons = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            String newcoupon = couponHelper.newCoupon();
            coupons.add(newcoupon);
        }
      return coupons;
    }
}
