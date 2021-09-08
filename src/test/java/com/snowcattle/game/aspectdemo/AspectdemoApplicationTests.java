package com.snowcattle.game.aspectdemo;

import com.snowcattle.game.aspectdemo.service.UserService;
import javassist.NotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AspectdemoApplicationTests {

    @Test
    void contextLoads() throws NotFoundException {
//        new UserService().add(null);
    }

}
