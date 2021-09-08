package com.snowcattle.game.aspectdemo;

import com.snowcattle.game.aspectdemo.service.UserService;
import com.snowcattle.game.aspectdemo.utils.SpringContextUtil;
import javassist.NotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AspectdemoApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    void contextLoads() throws NotFoundException {
//        new UserService().add(null);
        userService.add(null);
    }

}
