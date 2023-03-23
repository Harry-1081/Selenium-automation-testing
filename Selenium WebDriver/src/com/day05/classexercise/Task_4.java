package com.day05.classexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
    }
}
