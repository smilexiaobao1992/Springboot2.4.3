package com.begin.springboot2.controller;

import com.begin.springboot2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : xujunbao
 * @ClassName com.begin.springboot2.controller
 * @description 测试Restful API
 * @Create Date : 2023/1/29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    public Map<String,Object> getUserList() {
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        User user = new User();
        user.setId(1L);
        user.setName("liu");
        user.setAge("12");
        Map<String,Object> hashMap = new HashMap<>();
        hashMap.put("user",user);
        return hashMap;
    }

}
