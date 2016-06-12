package com.fantasy.kitchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2016/6/12 0012.
 */

@Controller
public class KitchenApi {

    @RequestMapping("testApi")
    @ResponseBody
    public Map<Object, Object> testApi() {
        Map<Object, Object> result = new HashMap<Object, Object>(10);

        Random rand = new Random(System.currentTimeMillis());

        for(int i = 0; i < 10; i++) {
            result.put("key" + i, rand.nextInt());
        }

        return result;
    }
}
