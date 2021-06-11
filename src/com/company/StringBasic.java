package com.company;

public class StringBasic {
    public boolean solution(String s) {
        boolean answer = true;

        s = "a1234";

        if (s.length() == 4 || s.length() == 6) {
            if (s.matches("^[0-9]*$")) {
                answer = true;
            }
            else {
                answer = false;
            }
        }


        return answer;

    }
}