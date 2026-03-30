package com.makelino92.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean isValid = false;

        System.out.println("=== Incepe Validarea Username-ului ===");

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            // REGULA 1: Fără spații
            if (username.contains(" ")) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                continue; // O ia de la capăt, nu mai verifică restul
            }

            // REGULA 2: Lungimea între 6 și 12
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Trebuie sa aiba intre 6 si 12 caractere.");
                continue;
            }

            // REGULA 3: Cel puțin o cifră (Logica din Cursul 6)
            boolean areCifra = false;
            for (int i = 0; i < username.length(); i++) {
                if (Character.isDigit(username.charAt(i))) {
                    areCifra = true;
                    break; // Am găsit o cifră, ne oprim
                }
            }

            if (!areCifra) {
                System.out.println("Eroare: Trebuie sa contina cel putin o cifra (0-9).");
            } else {
                // Dacă am ajuns aici, toate regulile sunt ok
                isValid = true;
                System.out.println("Username acceptat: [" + username + "]");
            }

        } while (!isValid);

        scanner.close();
    }
}