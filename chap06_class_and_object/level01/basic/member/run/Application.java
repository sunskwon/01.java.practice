package com.ohgiraffers.chap06_class_and_object.level01.basic.member.run;

import com.ohgiraffers.chap06_class_and_object.level01.basic.member.model.vo.MemberVO;

public class Application {

    public static void main(String[] args) {

        // getter를 이용해서 필드의 초기값 확인
        // setter를 이용해서 필드의 값 변경
        // getter를 이용해서 변경된 필드 값 확인

        MemberVO member = new MemberVO();
        member.printBefore();

        member.setId("user01");
        member.setPwd("pass01");
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('M');
        member.setPhone("010-1234-5678");
        member.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id : " + member.getId());
        System.out.println("변경 후 pwd : " + member.getPwd());
        System.out.println("변경 후 name : " + member.getName());
        System.out.println("변경 후 age : " + member.getAge());
        System.out.println("변경 후 gender : " + member.getGender());
        System.out.println("변경 후 phone : " + member.getPhone());
        System.out.println("변경 후 email : " + member.getEmail());
    }
}