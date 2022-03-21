package com.meng.service.impl;

import com.meng.dao.StudentDao;
import com.meng.domain.Student;
import com.meng.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int rows = studentDao.insertStudent(student);
        return rows;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
