package day07.classExercise;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Task_5 {
	WebDriver driver;
	String url = "https://www.godaddy.com/en-in";
  @SuppressWarnings("deprecation")
  @Test
  public void TestCase1() {
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  String actualTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  assertEquals(actualTitle, (driver.getTitle()));
	  assertEquals(url, (driver.getCurrentUrl()));
	  driver.quit();
  }
  
  @SuppressWarnings("deprecation")
  @Test
  public void TestCase2() {
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  driver.quit();
  }
  
  @SuppressWarnings("deprecation")
  @Test
  public void TestCase3(){
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  String pageTitle = driver.getTitle();
	  System.out.println("Title : " + pageTitle);
	  if(pageTitle.equals(driver.getTitle()))
	  {
		  
	  }
//	  driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver =  new ChromeDriver();	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
