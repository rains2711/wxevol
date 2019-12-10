package com.cn.wanxi.webuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class WebuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebuserApplication.class, args);
    }
    @RequestMapping("/user")
    public String main(){
        return "index";
    }
}
