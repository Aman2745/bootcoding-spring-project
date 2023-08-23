package com.bootcoding.spring.couponsystem.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Voucher {
    private  String id;
    private  int validfor;
    private String title;
    private String category;
    private int dicount;
}
