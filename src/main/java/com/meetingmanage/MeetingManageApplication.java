package com.meetingmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.meetingmanage.Mapper")
@SpringBootApplication
public class MeetingManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingManageApplication.class, args);
    }

}
