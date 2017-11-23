package com.sericefeign.feign.util;

import com.sericefeign.feign.sao.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
   @Override
    public  String sayHiFromClientOne(String name){
       return "sorry"+name;
   }
}
