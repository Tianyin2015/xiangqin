package com.example.demo.api;


import com.example.demo.dao.UserInfo;
import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述:
 * @author  郑银
 * @data 2020/11/14 17:11
 * @version V1.0
 *
 */
@RestController
public class DemoApi {


    @Autowired
    private UserMapper userMapper;

    /**
     * 功能描述：demo
     *
     * @return String
     */
    @GetMapping("/love")
    public String demo2() {
        System.out.println("--------demo2-----------");
        UserInfo u=new UserInfo();
        List<UserInfo> list=userMapper.selectList(null);
        System.out.println(list);
        return  "ttt";
    }

    /**
     * 功能描述：demo
     *
     * @return String
     */
    @GetMapping("/love2")
    public String demo3() {
        System.out.println("--------demo3-----------");
        List<UserInfo> list=userMapper.queryUserInfo();
        System.out.println(list);
        return list.toString();
    }

}
