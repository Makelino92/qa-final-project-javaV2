package com.makelino92.homework;

public class User {
    protected String username;
    protected int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void displayUserInfo() {
        System.out.println("Utilizator: " + username + ", Varsta: " + age);
    }
}