package com.cn.wanxi.webtechnologysharing.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LiRui
 * @since 2019-12-13
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    @RequestMapping("a")
    public String aa(){
        System.out.println("Ad");
        return "/index";
    }
}

