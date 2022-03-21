package com.meng.spring.ba06;

public class Student {

     private String name;
     private Integer age;

    //声明一个引用类型
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setSchool(School school) {
//        System.out.println("School = "+school);
        this.school = school;
    }


    public Student(String myname, Integer myage, School myschool) {
//        System.out.println("Student的有参构造方法");
        this.name = myname;
        this.age = myage;
        this.school = myschool;
    }

    public Student() {
//        System.out.println("student的空参构造");
    }

    public void setName(String name) {
//        System.out.println("setName");
        this.name = name;
    }

    public void setAge(Integer age) {
//        System.out.println("setAge");
        this.age = age;
    }
}
