package com.ohgiraffers.chap06_class_and_object.level01.basic.member.model.vo;

public class MemberVO {

    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public void setId(String id) {

        this.id = id;
    }

    public void setPwd(String pwd) {

        this.pwd = pwd;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setGender(char gender) {

        this.gender = gender;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getId() {

        return this.id;
    }

    public String getPwd() {

        return this.pwd;
    }

    public String getName() {

        return this.name;
    }

    public int getAge() {

        return this.age;
    }

    public char getGender() {

        return this.gender;
    }

    public String getPhone() {

        return this.phone;
    }

    public String getEmail() {

        return this.email;
    }

    public void printBefore() {

        System.out.println("id : " + this.id);
        System.out.println("pwd : " + this.pwd);
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("gender : " + this.gender);
        System.out.println("phone : " + this.phone);
        System.out.println("email : " + this.email);
    }
}
