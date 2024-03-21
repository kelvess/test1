package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


public class Main {

    private static ChromeOptions c;

    public static void main(String[] args) {
        c = new ChromeOptions();

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\kamil\\Desktop\\test1\\chromedriver.exe");
        System.setProperty("Webdriver.chrome.logfile", "/log.log");
        System.setProperty("Webdriver.chrome.verboseLogging", "true");
        System.setProperty("Webdriver.chrome.whitelistedIps", "");
        c.addArguments("--remote-allow-origins=*");
        c.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(c);
        //driver 121, chrome 121-122
        //chrome 123-124 not support in current selenium ver
        driver.get("https://nexign.ru");
        driver.findElement(By.xpath("//*[@id=\"block-menyusverkhunewru\"]/ul/li[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"block-menyusverkhunewru\"]/ul/li[3]/ul/li[1]/a")).click();





    }
}