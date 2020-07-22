package com.scubatraining.Gowri.seleniummethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Application2 {
	CommonRepo rep = new CommonRepo();
	WebDriver driver;
	
	@BeforeTest
	public void loadproperties() throws Throwable {
		driver = rep.getdriver("Firefox");
		driver.manage().window().maximize();
	}

	@Test()
	public void Register() throws Exception {
		driver.get("https://google.com");
		 WebElement element = driver.findElement(By.name("q"));
	     element.sendKeys("Selenium");
	     element.submit();
		Thread.sleep(2000);
	}
}
