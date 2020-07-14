package com.scubatraining.Gowri.seleniummethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTrng {

	CommonRepo rep = new CommonRepo();
	WebDriver driver;
	WebDriverWait wait;

	public void run() throws Exception {
		driver = rep.getdriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		// rep.links(driver.findElement(By.xpath("(//div[text()='Elements'])[2]")));
		rep.links(driver.findElement(By.xpath("//span[text()='Text Box']")));
		rep.textbox(driver.findElement(By.xpath("//input[@id='userName']")), "Gowri");
		rep.links(driver.findElement(By.xpath("//span[text()='Check Box']")));
		rep.links(driver.findElement(By.xpath("//button[@title='Toggle']")));
		rep.links(driver.findElement(By.xpath("//span[text()='Desktop']")));

		rep.Scrolldown();
		Thread.sleep(2000);

		rep.links(driver.findElement(By.xpath("//span[text()='Links']")));
		Thread.sleep(1000);
		String oldwin = driver.getWindowHandle();
		rep.links(driver.findElement(By.xpath("(//a[text()='Home'])[1]")));
		rep.switchtotab(driver);
		// driver.switchTo().window(oldwin);
		Thread.sleep(1000);
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		rep.Scrolldown();
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.urlContains("links"));
		rep.links(driver.findElement(By.xpath("//span[text()='Upload and Download']")));
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//a[@id='downloadButton']")));
		rep.clickbyAction(driver.findElement(By.xpath("//input[@id='uploadFile']")));
		Thread.sleep(1000);
		rep.uploadafile("/Users/gowriv/Downloads/Gowri/Screenshot_1574833120.png");
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']")));
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Browser Windows']")));
		rep.links(driver.findElement(By.xpath("//button[@id='tabButton']")));
		rep.switchtotab(driver);
		Thread.sleep(1000);
		driver.switchTo().window(oldwin);
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//button[@id='windowButton']")));
		rep.switchtowindow(driver);
		Thread.sleep(1000);
		driver.switchTo().window(oldwin);
		rep.links(driver.findElement(By.xpath("//button[@id='messageWindowButton']")));
		driver.switchTo().window(oldwin);
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Alerts']")));
		rep.links(driver.findElement(By.xpath("//button[@id='alertButton']")));
		rep.checkAlert_Accept();
		rep.links(driver.findElement(By.xpath("//button[@id='timerAlertButton']")));
		rep.checkAlert_Accept();
		rep.links(driver.findElement(By.xpath("//button[@id='confirmButton']")));
		rep.checkAlert_Accept();
		rep.links(driver.findElement(By.xpath("//button[@id='promtButton']")));
		rep.checkAlert_EnterAccept("Test");
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//div[text()='Widgets']")));
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Accordian']")));
		rep.links(driver.findElement(By.xpath("//div[@id='section2Heading']")));
		rep.links(driver.findElement(By.xpath("//div[@id='section3Heading']")));
		Thread.sleep(1000);
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Auto Complete']")));
		rep.links(driver.findElement(By.xpath("//span[text()='Tabs']")));
		rep.links(driver.findElement(By.xpath("//a[@id='demo-tab-origin']")));
		rep.links(driver.findElement(By.xpath("//a[@id='demo-tab-use']")));
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Auto Complete']")));
		Thread.sleep(2000);
		rep.EntertwoTextUsingAction(driver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']")), "red",
				"Green");

		rep.Scrolldown();
		Thread.sleep(1000);

		rep.links(driver.findElement(By.xpath("//span[text()='Select Menu']")));

		rep.EnteroneTextUsingAction(driver.findElement(By.xpath("//input[@id='react-select-6-input']")),
				"A root option");
		rep.SelectByVisibleText(driver.findElement(By.id("oldSelectMenu")), "Red");
		rep.links(driver.findElement(By.xpath("//div[text()='Widgets']")));
		Thread.sleep(1000);
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//div[text()='Interactions']")));
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Sortable']")));
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//a[@id='demo-tab-grid']")));
		rep.Scrolldown();
		Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Resizable']")));
		rep.resize(
				driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]")),
				413, 233);
		rep.resize(
				driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[2]")),
				81, 20);
		// rep.links(driver.findElement(By.xpath("//span[@class='react-resizable-handle
		// react-resizable-handle-se']")));
		// rep.dragAndDropBy(driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']")),
		// 413, 219);
		// rep.dragAndDropBy(driver.findElement(By.xpath("//div[@id='resizable']")),63,
		// 58);
		rep.Scrolldown(); Thread.sleep(1000);
		rep.links(driver.findElement(By.xpath("//span[text()='Dragabble']")));
		rep.dragAndDropBy(driver.findElement(By.xpath("//div[text()='Drag me']")), 320, 160);
		rep.links(driver.findElement(By.xpath("//a[@id='draggableExample-tab-axisRestriction']")));
		rep.dragAndDrop(driver.findElement(By.xpath("//div[@id='restrictedX']")),
				driver.findElement(By.xpath("//div[@id='restrictedY']")));
		rep.links(driver.findElement(By.xpath("//a[@id='draggableExample-tab-containerRestriction']")));
		rep.dragAndDropBy(driver.findElement(By.xpath("//div[contains(text(),'m contained within the box')]")), 363,
				100);
		rep.dragAndDropBy(driver.findElement(By.xpath("//span[contains(text(),'m contained within my parent')]")), 12,
				87);
		rep.links(driver.findElement(By.xpath("//a[@id='draggableExample-tab-cursorStyle']")));
		rep.dragAndDropBy(driver.findElement(By.xpath("//div[@id='cursorTopLeft']")), 545, -136);
		rep.dragAndDropBy(driver.findElement(By.xpath("//div[@id='cursorCenter']")), 399, 114);
		rep.dragAndDropBy(driver.findElement(By.xpath("//div[@id='cursorBottom']")), 285, 42);

		 driver.quit();

	}

	public static void main(String[] args) {
		try {
			new SeleniumTrng().run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}