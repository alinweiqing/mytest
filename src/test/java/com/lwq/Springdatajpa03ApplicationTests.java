package com.lwq;

import com.lwq.dao.StudentReposistory;
import com.lwq.entity.Grade;
import com.lwq.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Optional;

@SpringBootTest
class Springdatajpa03ApplicationTests {

    @Resource
    StudentReposistory studentReposistory;
    @Test
    void contextLoads() {
        //创建年级
        Grade grade = new Grade("S1");
        //创建学生对象
        Student student =new Student();
        student.setStudentname("张浩");
        student.setGrade(grade);

        //保存学生
        studentReposistory.save(student);

    }

    @Test
    public void testSelect(){
        //根据编号获取学生信息
        Optional<Student> students= studentReposistory.findById(1);
        Optional<Optional<Student>> student = Optional.of(students);
        System.out.println(student);
        System.out.println(student.get());
    }
}
