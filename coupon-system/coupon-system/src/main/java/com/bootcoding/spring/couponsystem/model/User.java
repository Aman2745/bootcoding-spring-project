package com.bootcoding.spring.couponsystem.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String firstname;
    private String lastname;
    private String password;

}
