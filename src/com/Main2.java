package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
//        System.out.println("A".matches("(?i)a"));
//        System.out.println("A".matches("(?s)a"));
//        "A".matches("(?m)a");
//
//        System.out.println("A".matches("(?x)A#this is comment"));//comments
//        System.out.println("A".matches("(?ix)a#this is comment"));
//        System.out.println("AA".matches("(?i)a(?-i)a"));
//        System.out.println("AA".matches("(?i)a(?-i)A"));
        System.out.println("AAA".matches("(?i)a(?-i:A)a"));

    }
}
