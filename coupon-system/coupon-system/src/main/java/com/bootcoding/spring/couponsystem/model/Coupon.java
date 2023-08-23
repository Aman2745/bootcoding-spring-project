package com.bootcoding.spring.couponsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jshell.Snippet;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name="coupon")
public class Coupon {
     @Id
     @GeneratedValue
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
    private boolean isActive;
}