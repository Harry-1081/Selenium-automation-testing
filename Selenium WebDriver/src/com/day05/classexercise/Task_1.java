package com.day05.classexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        System.out.println("Result : "+((driver.getTitle().equals("Home"))?"Success":"Failure"));
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        System.out.println("Result : "+((driver.getTitle().equals("Shop"))?"Success":"Failure"));
    }
}