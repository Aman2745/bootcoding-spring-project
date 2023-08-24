package com.bootcoding.spring.couponsystem.util;

import java.security.SecureRandom;

//@Component
public class CouponCodeGenerator {

        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        private static final int CODE_LENGTH = 10;

        public static String generateCouponCode() {
            SecureRandom random = new SecureRandom();
            StringBuilder codeBuilder = new StringBuilder(CODE_LENGTH);

            for (int i = 0; i < CODE_LENGTH; i++) {
                int randomIndex = random.nextInt(CHARACTERS.length());
                char randomChar = CHARACTERS.charAt(randomIndex);
                codeBuilder.append(randomChar);
            }

            return codeBuilder.toString();
        }

}
