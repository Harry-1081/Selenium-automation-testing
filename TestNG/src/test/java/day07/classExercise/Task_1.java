package day07.classExercise;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Task_1 {
	WebDriver driver;
	String url = "https://demo.wpeverest.com/user-registration/guest-registration-form/";
  @Test
  public void checkTitle() 
  {
	  driver.manage().window().maximize();
	  String obtainedTitle = driver.getTitle();
	  String actualTitle = "Guest Registration Form – User Registration";
	  assertEquals(obtainedTitle, actualTitle);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.navigate().to(url);
  }

  @AfterMethod
  public void afterMethod()
  {
  }

}
