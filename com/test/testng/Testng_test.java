package com.test.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_test {
  
	public String baseUrl = "http://demo.guru99.com/test/newtours/index.php";
   // String driverPath = "C:\\geckodriver.exe";
    
    public WebDriver driver; 
    driver=new ChromeDriver();
   
	
	@Test
  public void f() {
		system.out.println("launching firefox browser"); 
		System.setProperty("webdriver.chrome.driver","D://Selenium jar//chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	     // driver.close();
  }
}
