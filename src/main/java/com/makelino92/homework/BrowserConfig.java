package com.makelino92.homework;

public class BrowserConfig {
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // 1: Toți cei 3 parametri
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    //  2: Doar browser și version
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    // 3: Doar browser
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest", false);
    }

    // Metoda Statică Factory
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metoda de Afișare
    public void afiseazaConfig() {
        System.out.println("Browser: " + browser + ", Version: " + version + ", Headless: " + isHeadless);
    }
}