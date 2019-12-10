package com.cn.wanxi.webuser;

import com.cn.wanxi.entity.user.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/d")
public class UserControl {


    /**
     * 返回json数据
     * @param userEntity
     * @return
     */
    @RequestMapping(value = "/d",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public UserEntity setu(@RequestBody UserEntity userEntity){
        System.out.println(userEntity.getId());
        userEntity.setUrl("user/user");
        return userEntity;
    }

    /**
     * 返回页面
     * @return
     */
    @RequestMapping("/dd")
    public String aa(){
        return "user/user";
    }

}
