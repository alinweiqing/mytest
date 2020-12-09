package com.lwq;

import com.lwq.dao.ResosRepository;
import com.lwq.entity.Resos;
import com.lwq.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ResosApplicationTests {

    @Resource
    private ResosRepository resosRepository;

    @Test
    public  void  test(){
        Resos resos = new Resos("管理员");
        Users user1 = new Users();
        user1.setName("哈哈");
        user1.setResos(resos);
        Users user2 = new Users();
        user2.setName("呵呵");
        user2.setResos(resos);
        resos.getUsers().add(user1);
        resos.getUsers().add(user2);
        resosRepository.save(resos);


    }


}
