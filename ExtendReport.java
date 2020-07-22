package com.scubatraining.Gowri.seleniummethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.Status;

public class ExtendReport {

	public WebDriver driver;

	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;

	CommonRepo rep = new CommonRepo();

	@BeforeTest
	public void ExtendSetup() {

		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myreport.html");

		htmlreporter.config().setDocumentTitle("Automation Report");
		htmlreporter.config().setReportName("TestNG Report");
		htmlreporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

		extent.setSystemInfo("OS", "Mac");
		extent.setSystemInfo("Tester", "Gowri");
		extent.setSystemInfo("Browser", "Chrome");
	}

	@AfterTest
	public void EndReport() {
		extent.flush();
	}

	@BeforeMethod
	public void Setup() throws Throwable {

		driver = rep.getdriver("Chrome");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
	}

	@Test
	public void Login() throws Exception {
		test = extent.createTest("Login");
		rep.textbox(driver.findElement(By.xpath("//input[@id='userName']")), "Gowri14");
		rep.textbox(driver.findElement(By.xpath("//input[@id='password']")), "Gopi@1423");
		rep.links(driver.findElement(By.xpath("//button[@id='login']")));
		Assert.assertEquals(rep.gettext(driver.findElement(By.xpath("//div[text()='Profile']"))), "Profile");
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		driver.close();
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test Case Faied is" + result.getName());
			test.log(Status.FAIL, "Test Case Failed is" + result.getThrowable());
			test.addScreenCaptureFromPath(rep.takescreenshot("/Users/gowriv/Desktop/Automation", "Report"));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case Passed is" + result.getName());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case Skipped" + " is" + result.getName());
		}

	}
}
