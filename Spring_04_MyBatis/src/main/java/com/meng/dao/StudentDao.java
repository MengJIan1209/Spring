package com.meng.dao;

import com.meng.domain.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);

    List<Student> selectStudents();
}
