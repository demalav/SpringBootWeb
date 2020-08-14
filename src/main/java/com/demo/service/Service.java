package com.demo.service;

@Service
public class Service {


    public boolean getPalindrome(String s) {
        String newString = s.replaceAll("\\s+", "");
        StringBuilder plain = new StringBuilder(newString);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equalsIgnoreCase(newString);
    }
}
