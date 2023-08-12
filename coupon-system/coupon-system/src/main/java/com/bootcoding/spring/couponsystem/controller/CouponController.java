package com.bootcoding.spring.couponsystem.controller;

import com.bootcoding.spring.couponsystem.Coupon;
import com.bootcoding.spring.couponsystem.helper.CouponHelper;
import com.bootcoding.spring.couponsystem.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/coupon/")
public class CouponController {
    @Autowired
    private CouponService couponService;
    private CouponHelper couponHelper;

@GetMapping("getmultiplecoupon")
    public List<String>getnewcoupon(){
    System.out.println("/getinvoked-getmultiplecoupon");
    return couponService.getNewCoupon(10);
  }

  @GetMapping("newcoupon")
    public String newCoupon(){
      System.out.println("/getinvoked-newcoupon");
    return couponService.getNewCoupon();
  }

    @GetMapping("getJson")
    public Coupon getDummyJson(){
        return Coupon.builder()
                .id(couponService.getNewCoupon())
                .type("Voucher")
                .validFor(3).build();
    }




}
