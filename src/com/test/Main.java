package com.test;

public class Main {

    public static void main(String[] args) {
        //проверка с помощью лямбды на данные, цифры или буквы и т.д.
        String someString = "4656.5";
        boolean isNumeric = someString.chars().allMatch(Character::isDigit);
        System.out.println(isNumeric);
    }
}
