package com.snowcattle.game.aspectdemo;

import com.snowcattle.game.aspectdemo.service.UserService;
import com.snowcattle.game.aspectdemo.utils.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AspectdemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(AspectdemoApplication.class, args);
        SpringContextUtil.setApplicationContext(applicationContext);
    }

}
