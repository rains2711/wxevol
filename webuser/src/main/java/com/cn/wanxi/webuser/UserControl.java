package com.cn.wanxi.webuser;

import com.cn.wanxi.entity.user.UserEntity;
import com.cn.wanxi.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserControl {
    @Autowired
    private UserService userService;

    /**
     * 返回json数据
     *
     * @param userEntity
     * @return
     */
    @RequestMapping(value = "/d", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public UserEntity setu(@RequestBody UserEntity userEntity) {
        System.out.println(userEntity.getId());
        userEntity.setUrl("user/user");
        return userEntity;
    }

    @RequestMapping(value = "/add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> add(@RequestBody UserEntity userEntity) {
        Map<String, Object> map=new HashMap<>();
        map.put("userEntity",userEntity);
        userService.add(map);
        return map;
    }

    /**
     * 返回页面
     *
     * @return
     */
    @RequestMapping("/dd")
    public String aa() {
        return "user/user";
    }

}
