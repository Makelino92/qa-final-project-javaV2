package com.makelino92.homework;

public class AdminUser extends User {
    private String permissionLevel;

    public AdminUser(String username, int age, String permissionLevel) {
        super(username, age);
        this.permissionLevel = permissionLevel;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Admin: " + username + ", Varsta: " + age + ", Permisiuni: " + permissionLevel);
    }
}