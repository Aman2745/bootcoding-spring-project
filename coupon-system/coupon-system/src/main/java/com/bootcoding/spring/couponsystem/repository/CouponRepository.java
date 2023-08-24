package com.bootcoding.spring.couponsystem.repository;

import com.bootcoding.spring.couponsystem.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon,Integer>{

}
