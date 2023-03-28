package com.day06.classexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_2 
{
    public static void main(String[] args) throws InterruptedException 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Prasanna");
        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("Harry2k@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Harry2003#!");
        System.out.println("First Name Box-display : "+(driver.findElement(By.xpath("//*[@id=\"first_name\"]")).isDisplayed()));
        System.out.println("Email Box-display : "+(driver.findElement(By.xpath("//*[@id=\"user_email\"]")).isDisplayed()));
        driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();

        js.executeScript("window.scrollBy(0,1000)");
            
        driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
    }
}
