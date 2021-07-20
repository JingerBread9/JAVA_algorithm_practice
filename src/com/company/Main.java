package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



/*
        String s = "토마스 뮐러(Thomas Muller)의 등번호는 25번입니다.";

        // contains() 함수
        // 문자열에 특정문자를 포함하고 있는지 확인하는 함수

        if (s.contains("토마스 뮐러")) {
            System.out.println("contains() : 해당 문자열에는 \'토마스 뮐러\'가 포함되어있습니다.\n");
        }
        else {
            System.out.println("contains() : 해당 문자열에는 \'토마스 뮐러\'가 포함되어있지 않습니다.\n");
        }


        // matches() 함수
        // 정규식을 이용하여 특정 문자가 있는지 검색하는 함수

        // matches 문자열 정규식 찾기
        if(s.matches(".*토마스 뮐러.*")) {
            System.out.println("matches() : 해당 문자열에는 \'토마스 뮐러\'가 포함되어 있습니다.\n");
        }else {
            System.out.println("matches() : 해당 문자열에는 \'토마스 뮐러\'가 포함되어 있지 않습니다.\n");
        }

        // matches 문자열 정규식 숫자 찾기
        if(s.matches(".*[0-9].*")) {
            System.out.println("matches() : 해당 문자열에는 숫자가 포함되어 있습니다.");
        }else {
            System.out.println("matches() : 해당 문자열에는 숫자가 포함되어있지 않습니다.");
        }


 */
        //자주 쓰는 정규식 패턴 모음
//        숫자만 : ^[0-9]*$
//        영문만 : ^[a-zA-Z]*$
//        영문만, 띄어쓰기가능 : /^[a-zA-Z\s]+$/
//        한글만 : ^[가-힣]*$
//        한글만,띄어쓰기가능 :  /^[가-힣\s]+$/
//        한글 & 영문만 : /^[가-힣a-zA-Z]+$/;
//        영문 & 숫자만 : ^[a-zA-Z0-9]*$
//        E-Mail : ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$
//        휴대폰 : ^01(?:0|1|[6-9]) - (?:\d{3}|\d{4}) - \d{4}$
//        일반전화 : ^\d{2,3} - \d{3,4} - \d{4}$
//        URL : /^(file|gopher|news|nntp|telnet|https?|ftps?|sftp):\/\/([a-z0-9-]+\.)+[a-z0-9]{2,4}.*$/
//        주민등록번호 : \d{6} \- [1-4]\d{6}
//        IP 주소 : ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3})



        //입력받은 숫자를 n의 갯수만큼 출력하기


        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Integer> v1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            v1.add(value);

        }
        for (int i=0; i<n; i++) {
            System.out.println(v1.get(i));
        }



    }
}
