package org.Ders20_Odev.Drivers;


import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.time.Duration;

public class Driver {
    public static WebDriver webDriver;

    public WebDriver initializeDriver() throws MalformedURLException {
        webDriver = DriverFactory.getDriver();

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        webDriver.manage().window().maximize();

        return webDriver;
    }
    public void quitDriver() {
        webDriver.quit();
    }
}

