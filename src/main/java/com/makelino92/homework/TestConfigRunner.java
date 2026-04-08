package com.makelino92.homework;

public class TestConfigRunner {
    public static void main(String[] args) {

        // 1. Testăm metoda statică
        BrowserConfig defaultConfig = BrowserConfig.createDefaultChromeConfig();
        System.out.println("--- Configuratie Default ---");
        defaultConfig.afiseazaConfig();

        // 2. Testăm constructorul cu 2 parametri
        BrowserConfig firefoxConfig = new BrowserConfig(BrowserType.FIREFOX, "121.0");
        System.out.println("--- Configuratie Firefox ---");
        firefoxConfig.afiseazaConfig();

        // 3. Testăm constructorul cu 3 parametri
        BrowserConfig edgeConfig = new BrowserConfig(BrowserType.EDGE, "119.0", true);
        System.out.println("--- Configuratie Edge ---");
        edgeConfig.afiseazaConfig();
    }
}