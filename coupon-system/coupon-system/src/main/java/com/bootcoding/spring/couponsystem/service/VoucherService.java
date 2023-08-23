package com.bootcoding.spring.couponsystem.service;

import com.bootcoding.spring.couponsystem.model.Voucher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Component
@Service
public class VoucherService {
    public Voucher newVoucher(){
        Voucher voucher=Voucher.builder()
                .id(UUID.randomUUID().toString())
                .title("voucher")
                .category("voucher")
                .dicount(10+new Random().nextInt(30))
                .validfor(1+new Random().nextInt(60))
                .build();

        return voucher;
    }

}
