package com.day06.classexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"input-firstname\"]")).sendKeys("Prasanna");
		driver.findElement(By.xpath("//input[@id=\"input-lastname\"]")).sendKeys("Harry");
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("Harry2003@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("Harry2003#");
		driver.findElement(By.xpath("//input[@id=\"input-newsletter-yes\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	} 
}

