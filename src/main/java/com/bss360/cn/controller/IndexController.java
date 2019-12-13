package com.bss360.cn.controller;/**
 * Created by ASUSon 2019/12/13 13:05
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: wxlimsExtend

 * @description: 首页

 * @author: yuezm

 * @create: 2019-12-13 13:05
 **/

@Controller
public class IndexController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object IndexController() {
        return "index";
    }
}
