package com.scubatraining.Gowri.seleniummethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStore {

	CommonRepo rep = new CommonRepo();

	/*--------BookStore Application--------*/
	public void Book_Store() throws Exception {
		WebDriver driver = rep.getdriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();

		//rep.links(driver.findElement(By.xpath("//div[text()='Book Store Application']")));
		//Thread.sleep(1000);
		//rep.links(driver.findElement(By.xpath("//span[text()='Login']")));
		rep.textbox(driver.findElement(By.xpath("//input[@id='userName']")), "Gowri14");
		rep.textbox(driver.findElement(By.xpath("//input[@id='password']")), "Gopi@1423");
		rep.links(driver.findElement(By.xpath("//button[@id='login']")));
		Thread.sleep(2000);
		rep.Scrolldown();
		Thread.sleep(2000);
		rep.clickbyAction(driver.findElement(By.xpath("//button[@id='gotoStore']")));
		Thread.sleep(2000);
		rep.links(driver.findElement(By.xpath("//span[@id='see-book-Learning JavaScript Design Patterns']")));
		Thread.sleep(2000);
		rep.Scrolldown();
		Thread.sleep(2000);
		rep.links(driver.findElement(By.xpath("//button[text()='Add To Your Collection']")));
		rep.checkAlert_Accept();
		rep.links(driver.findElement(By.xpath("//button[text()='Back To Book Store']")));
		Thread.sleep(1000);
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Profile']")));	
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("(//span[@id='delete-record-undefined'])[2]")));
		rep.links(driver.findElement(By.xpath("//button[text()='OK']")));
		rep.checkAlert_Accept();
		rep.links(driver.findElement(By.xpath("//button[text()='Log out']")));
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Book Store']")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		rep.textbox(driver.findElement(By.xpath("//input[@id='searchBox']")), "Learning");
	}

	public void Pratice_Form() throws Exception {

		WebDriver driver = rep.getdriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		//rep.links(driver.findElement(By.xpath("//div[text()='Forms']")));
		//rep.links(driver.findElement(By.xpath("//span[text()='Practice Form']")));
		rep.textbox(driver.findElement(By.xpath("//input[@id='firstName']")), "Gowri");
		rep.textbox(driver.findElement(By.xpath("//input[@id='lastName']")), "Venkatesan");
		rep.textbox(driver.findElement(By.xpath("//input[@id='userEmail']")), "XXX@gmail.com");
		rep.Radiobtn(driver.findElements(By.xpath("//input[@name='gender']")), "Male");
		
		rep.textbox(driver.findElement(By.xpath("//input[@id='userNumber']")), "9678948349");
		rep.links(driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")));
		rep.SelectDateFromCalender(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")), driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")), "03/14/1992");
		rep.textbox(driver.findElement(By.xpath("//input[@id='subjectsInput']")), "TEST");
		Thread.sleep(2000);
		rep.clickbyAction(driver.findElement(By.xpath("//label[text()='Sports']/preceding-sibling::input")));
		
		rep.clickbyAction(driver.findElement(By.xpath("//input[@id='uploadPicture']")));
		Thread.sleep(2000); 
		rep.uploadafile("/Users/gowriv/Downloads/Gowri/Screenshot_1574833120.png");
		Thread.sleep(1000);
		rep.textbox(driver.findElement(By.xpath("//textarea[@id='currentAddress']")), "23,QWE ST");
		Thread.sleep(1000);
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.EnteroneTextUsingAction(driver.findElement(By.xpath("//input[@id='react-select-3-input']")), "NCR");
		rep.EnteroneTextUsingAction(driver.findElement(By.xpath("//input[@id='react-select-4-input']")), "Delhi");
		//rep.links(driver.findElement(By.xpath("//button[text()='Submit']")));
	}

	public static void main(String[] args) throws Exception {
	new BookStore().Book_Store();
		//new BookStore().Pratice_Form();

	}

}
