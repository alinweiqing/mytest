package com.lwq.dao;

import com.lwq.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentReposistory  extends JpaRepository<Student,Integer> {
}
