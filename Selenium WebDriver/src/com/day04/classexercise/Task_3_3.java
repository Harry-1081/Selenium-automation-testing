package com.day04.classexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_3_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
	}

}
 