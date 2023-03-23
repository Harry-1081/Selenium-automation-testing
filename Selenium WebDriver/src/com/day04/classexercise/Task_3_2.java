package com.day04.classexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_3_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Text Box");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Returns")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Gift")).click();

	}

}
