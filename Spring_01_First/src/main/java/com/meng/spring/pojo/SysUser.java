package com.meng.spring.pojo;

public class SysUser {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "SysUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SysUser() {
    }

    public SysUser(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
