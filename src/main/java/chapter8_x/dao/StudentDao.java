package chapter8_x.dao;

import org.springframework.stereotype.Repository;

import chapter8_x.entity.Student;
@Repository
public interface StudentDao {
   Student getStudent(Integer id);
}