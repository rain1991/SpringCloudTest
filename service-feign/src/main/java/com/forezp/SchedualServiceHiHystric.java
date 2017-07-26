package com.forezp;

import org.springframework.stereotype.Component;

/**
 * Created by rain.zong on 2017/7/25.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
