package com.imooc.o2o.web.shopadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by byinl on 2018/6/13 9:06.
 */
@Controller
@RequestMapping(value = "/shopadmin",method = {RequestMethod.GET})
public class ShopAdminController {

    @RequestMapping("/shopoperation")
    public String shopOperation() {
        return "shop/shopoperation";
    }
}

