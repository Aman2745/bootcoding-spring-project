package com.bootcoding.spring.couponsystem.util;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class DateGenerator {

    private static Date between(Date startInclusive, Date endExclusive) {
        long startMillis = startInclusive.getTime();
        long endMillis = endExclusive.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }
    public Date datecreator() {
        long aDay = TimeUnit.DAYS.toMillis(1); // 1 day
        long now = new Date().getTime(); // current time
        Date tenDaysAgo = new Date(now - aDay * 10);
        Date oneYearAgo = new Date(now - aDay * 365);
        return between(oneYearAgo, tenDaysAgo);
    }
}
