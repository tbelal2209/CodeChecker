package com.company;

public class CodeWordRunner {

    public static void main(String[] args) {
        // write your code here
        StringChecker sc1 = new CodeWordChecker("$", 8, 6);
        StringChecker sc2 = new CodeWordChecker("pass", 8,6);

        System.out.println(sc1.isValid("happey"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));

        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("MypassPort"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}
