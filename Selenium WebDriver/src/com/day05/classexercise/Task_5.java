package com.day05.classexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.smart-hospital.in/site/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).click();
        System.out.println("Title : "+(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3"))).getText());
        System.out.println("Tag Name : "+(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3"))).getTagName());
        System.out.println("Tag Size : "+(driver.findElement(By.xpath("//*[@id=\"search-btn\"]"))).getSize());
        System.out.println("Tag Color : "+(driver.findElement(By.xpath("//*[@id=\"search-btn\"]"))).getCssValue("color"));
    }
}
