package com.bootcoding.spring.couponsystem.controller;

import com.bootcoding.spring.couponsystem.model.Coupon;
import com.bootcoding.spring.couponsystem.helper.CouponHelper;
import com.bootcoding.spring.couponsystem.model.User;
import com.bootcoding.spring.couponsystem.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/coupon/")
//ALL THE METHODS WILL BE INVOKED UNDER CONTROLLER
// AND REQUEST MAPPING HELPS IN URL WHICH IS ASSING IN
// APP NAME BY WHICH WE CAN ACCESS THIS GETMAPPING FUNCTIONS
public class CouponController {
    @Autowired
    private CouponService couponService;
    private CouponHelper couponHelper;

@GetMapping("getmultiplecoupon")
    public List<Integer>getnewcoupon(){
    System.out.println("/getinvoked-getmultiplecoupon");
    return couponService.getNewCoupon(10);
  }

  @PostMapping("Register")
  public String register(List<User>user){
    
      System.out.println(user);
      return "SUCCESS";
  }


//  @GetMapping("newcoupon")
//    public String newCoupon(){
//      System.out.println("/getinvoked-newcoupon");
//    return couponService.getNewCoupon();
//  }


   //  2. Get Coupon Details by Coupon Id using PathVariable
//    @GetMapping("coupon-id/{id}")
//    public String getCouponById(@PathVariable("id") String couponId){
//        return couponId + "-" + couponService.newCoupon();
//
//    }

    // 2.2 Get Coupon Details by Coupon Id using PathVariable
    @GetMapping("coupon-id/{id}")
    public Coupon getCouponObjectById(@PathVariable("id") String couponId){
        Coupon coupon = couponService.generateNewCoupon();
        return coupon;
    }

    @GetMapping("generate/new")
    public Coupon generateNewCoupon(){
     Coupon coupon = couponService.generateNewCoupon();
        return coupon;
    }
    // 3. Get Coupons with Filter (Query Parameter)
    @GetMapping("search_coupon")
    public String searchCoupon(
            @RequestParam("valid") boolean isValid,
            @RequestParam(value = "type", required = false) String couponType,
            @RequestParam("category") String category){
        return "Query Parameter valid = " + isValid
                + " | Coupon Type = " + couponType
                + " | Coupon Category = " + category;
    }
    // HTTP Methods Get
    @GetMapping("getCoupon")
    public String newCoupon(){
        System.out.println("/getCoupon invoked");
        return "New Coupon : " + couponService.getNewCoupon();
    }

    @GetMapping("getJson")
    public Coupon getDummyJson(){
        System.out.println("/getJson invoked");
        return Coupon.builder()
                .id(couponService.getNewCoupon()).build();
//                .type("Voucher")
//                .validFor(3).build();
    }

    @PostMapping("/generating-multiple/{id}")
    public List<Coupon> generatingMultiple(@PathVariable int id){
    return couponService.multipleGenerator(id);
    }



}
