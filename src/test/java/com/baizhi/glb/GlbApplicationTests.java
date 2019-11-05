package com.baizhi.glb;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class GlbApplicationTests {
    @Autowired
    private AdminDao adminDao;
    //添加
    @Test
    public void testInsert(){
        Admin admin = new Admin();
        admin.setId(UUID.randomUUID().toString()).setUsername("小绿绿").setPassword("654321").setNickname("好绿").setAge(19).setSex("女");
        int insert = adminDao.insert(admin);
        System.out.println(insert);
    }
    //修改
    @Test
    public void testUpdate(){
        Admin admin = new Admin();
        admin.setId("b1591ba6-6fc3-4b4b-ad0e-aa43ca7c70ed").setNickname("唉");
        //adminDao.updateByPrimaryKey(admin);
        adminDao.updateByPrimaryKeySelective(admin);
    }
    @Test
    void contextLoads() {
        /*List<Admin> admins = adminDao.selectAll();
        admins.forEach(admin -> System.out.println(admin));*/
        List<Admin> admins = adminDao.selectAll();

    }

}
