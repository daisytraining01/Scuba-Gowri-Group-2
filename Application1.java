package com.scubatraining.Gowri.seleniummethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Application1 {
	CommonRepo rep = new CommonRepo();
	WebDriver driver;
	

	@BeforeTest
	public void loadproperties() throws Throwable {
		driver = rep.getdriver("Chrome");
		driver.manage().window().maximize();
	}

	@Test()
	public void Register() throws Exception {
		driver.get("https://demoqa.com/login");
		rep.textbox(driver.findElement(By.xpath("//input[@id='userName']")), "Gowri14");
		rep.textbox(driver.findElement(By.xpath("//input[@id='password']")), "Gopi@1423");
		rep.links(driver.findElement(By.xpath("//button[@id='login']")));
		Thread.sleep(2000);
	}
}
