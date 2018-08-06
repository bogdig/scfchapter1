package com.ergou.servicefeign.clients.fallback;

import com.ergou.servicefeign.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author: 孙二狗
 * @Date: Created in 上午9:44 2018/8/5
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name){
        return "sorry, you are fail, "+name;
    }
}
