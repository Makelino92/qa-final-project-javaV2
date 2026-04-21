package com.makelino92.homework;

public class UserRepository {

    public void validateUserData(String username, int age) throws InvalidUserDataException {

        if (username == null || username.isEmpty()) {
            throw new InvalidUserDataException("Eroare: Username-ul nu poate fi null sau gol!");
        }

        if (username.length() < 3) {
            throw new InvalidUserDataException("Eroare: Username-ul '" + username + "' este prea scurt (minim 3 caractere)!");
        }

        if (age < 18 || age > 100) {
            throw new InvalidUserDataException("Eroare: Varsta " + age + " este invalida (trebuie sa fie intre 18 si 100)!");
        }

        System.out.println("Validare reusita pentru utilizatorul: " + username);
    }
}