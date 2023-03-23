package com.day05.classexercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        List<WebElement> list=driver.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
        for(int i=0;i<list.size();i++){
            System.out.println("Product "+(i+1)+" : "+(list.get(i).getText()));
        }
    }
}
