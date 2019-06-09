package com.hendisantika.springbootnativequerydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-native-query-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-09
 * Time: 08:00
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserNativeQuery userNativeQuery;
}
