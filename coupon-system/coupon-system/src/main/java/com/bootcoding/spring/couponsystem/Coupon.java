package com.bootcoding.spring.couponsystem;

import jdk.jshell.Snippet;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coupon {
    private String id;
    private String type;
    private int validFor;
}