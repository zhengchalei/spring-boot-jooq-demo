package com.github.zhengchalei;

import com.github.zhengchalei.jooq.Tables;
import com.github.zhengchalei.jooq.tables.daos.UserDao;
import com.github.zhengchalei.jooq.tables.pojos.User;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class SpringBootJooqDemoApplicationTests {

    @Autowired
    DSLContext dslContext;

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        List<User> all = userDao.findAll();
        System.out.println(all);
    }

}
