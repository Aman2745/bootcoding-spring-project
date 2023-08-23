package com.bootcoding.spring.couponsystem.service;

import com.bootcoding.spring.couponsystem.model.Coupon;
import com.bootcoding.spring.couponsystem.helper.CouponHelper;
import com.bootcoding.spring.couponsystem.util.DateGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CouponService {
    //dependency inject
    @Autowired
    private CouponHelper couponHelper = null;
    private DateGenerator dateGenerator;

    public String getNewCoupon() {

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


    public Coupon generateNewCoupon() {
        Coupon coupon = Coupon.builder()
                .id(UUID.randomUUID().toString())
//              .validFor(5 + new Random().nextInt(90))
//              .type("COUPON")
                /*
                    private String id;
    private String title;
    private int description;
    private String coupon_code;
    private Date validity;
    private int discount;
    private String category;
    private Date create_date;
    private String createdBy;
    private String status;
    private boolean isActive;2
                * */
                .build();
        return coupon;
    }


}
