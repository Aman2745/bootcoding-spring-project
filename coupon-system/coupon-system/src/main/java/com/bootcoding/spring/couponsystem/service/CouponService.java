package com.bootcoding.spring.couponsystem.service;

import com.bootcoding.spring.couponsystem.model.Coupon;
import com.bootcoding.spring.couponsystem.helper.CouponHelper;
import com.bootcoding.spring.couponsystem.repository.CouponRepository;
import com.bootcoding.spring.couponsystem.util.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Component
@Service

public class CouponService {
    //dependency inject
    @Autowired
    private CouponHelper couponHelper = null;
//    @Autowired
//    private DateGenerator dateGenerator;
//    @Autowired
//    private Generator_Id generatorId;
//    @Autowired
//    private TitleGenerator titleGenerator;
//    @Autowired
//    private Coupon_Code_Generator couponCodeGenerator;
    @Autowired
    private CouponRepository couponRepository;


    public int getNewCoupon() {
        return couponHelper.newCoupon();
    }

    public List<Integer> getNewCoupon(int quantity) {
        List<Integer> coupons = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            int newcoupon = couponHelper.newCoupon();
            coupons.add(Integer.valueOf(newcoupon));
        }
        return coupons;
    }


    public Coupon generateNewCoupon() {
        Coupon coupon = Coupon.builder()
                .title(TitleGenerator.randomTitle())
                .validity(DateGenerator.randomDate())
                .isActive(RandomBoolean.randomBoolean())
                .couponCode(CouponCodeGenerator.generateCouponCode())
                .discount(DiscountRandom.discountRandom())
                .build();
       return couponRepository.save(coupon);
    }

    public List<Coupon> multipleGenerator(int id){
        List<Coupon> newCoupon=new ArrayList<>();
        for(int i=0;i<id;i++) {
            newCoupon.add(generateNewCoupon());
        }
        return couponRepository.saveAll(newCoupon);
    }


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
}
