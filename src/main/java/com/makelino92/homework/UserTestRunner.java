package com.makelino92.homework;

public class UserTestRunner {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        // 1. Testăm un caz VALID
        try {
            repo.validateUserData("Alex", 25);
            User user1 = new User("Alex", 25);
            user1.displayUserInfo();
        } catch (InvalidUserDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------");

        // 2. Testăm un caz INVALID (Vârstă prea mică)
        try {
            repo.validateUserData("Ion", 15);
            User user2 = new User("Ion", 15);
            user2.displayUserInfo();
        } catch (InvalidUserDataException e) {
            System.out.println("S-a prins o exceptie: " + e.getMessage());
        }

        System.out.println("---------------------------");

        // 3. Testăm un AdminUser VALID
        try {
            repo.validateUserData("AdminMihai", 40);
            AdminUser admin = new AdminUser("AdminMihai", 40, "FULL_CONTROL");
            admin.displayUserInfo();
        } catch (InvalidUserDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------");
        System.out.println("Programul a continuat sa ruleze pana la final!");
    }
}