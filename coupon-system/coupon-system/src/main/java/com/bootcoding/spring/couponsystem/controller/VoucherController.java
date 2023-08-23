package com.bootcoding.spring.couponsystem.controller;

import com.bootcoding.spring.couponsystem.model.Voucher;
import com.bootcoding.spring.couponsystem.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voucher/")
public class VoucherController {
    @Autowired
    VoucherService vou;

    @GetMapping("newvoucher")
    public Voucher newvoucher(){
        return vou.newVoucher();
    }



}
