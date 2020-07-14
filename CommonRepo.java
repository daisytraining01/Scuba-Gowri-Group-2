package com.scubatraining.Gowri.seleniummethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;

public class CommonRepo {
	WebDriver driver;
	WebElement ele;
	WebDriverWait wait;
	
	Actions a ;
	
	public CommonRepo() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		a = new Actions(driver);
		
			
	}
	
	public WebDriver getdriver() throws Exception {
		
		return driver;
	}

	public void textbox(WebElement ele, String str) {

		ele.clear();
		ele.sendKeys(str);
	}

	public void checkbox(WebElement ele) {
		ele.click();
	}

	public void links(WebElement ele) {
		ele.click();
	}

	public void switchtowindow(WebDriver driver) {
		Set s = driver.getWindowHandles();
		Iterator itr = s.iterator();
		String w1 = (String) itr.next();
		String w2 = (String) itr.next();
		driver.switchTo().window(w2);
		driver.manage().window().maximize();
	}

	public void switchtotab(WebDriver driver) {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
	}

	public void switchtowindowmessage(WebDriver driver) {
		Set s = driver.getWindowHandles();
		Iterator itr = s.iterator();
		String w1 = (String) itr.next();
		String w2 = (String) itr.next();
		driver.switchTo().window(w2);
	}

	public void clickbyAction(WebElement ele) {
		a.moveToElement(ele).click().build().perform();
	}

	public void Scrolldown() {
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	public void TabKey() {
		a.sendKeys(Keys.TAB).build().perform();
	}
	
	public void EnteroneTextUsingAction( WebElement ele,String Value) {
		a.sendKeys(ele,Value).pause(1000).sendKeys(Keys.TAB).pause(1000).build().perform();
	}   
	public void EntertwoTextUsingAction( WebElement ele,String Value,String Value1) {
		a.sendKeys(ele,Value).pause(1000).sendKeys(Keys.TAB).pause(1000).sendKeys(ele,Value1).pause(1000).sendKeys(Keys.TAB).build().perform();
	}
	public void EnterthreeTextUsingAction( WebElement ele,String Value,String Value1,String Value2) {
		a.sendKeys(ele,Value).pause(1000).sendKeys(Keys.TAB).pause(1000).sendKeys(ele,Value1).pause(1000).sendKeys(Keys.TAB).pause(1000).sendKeys(ele,Value2).pause(1000).sendKeys(Keys.TAB).build().perform();
	}

	public void ScrollUp() {	
		a.sendKeys(Keys.PAGE_UP).build().perform();
	}

	public boolean checkAlert_Accept() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert a = driver.switchTo().alert();
			String str = a.getText();
			System.out.println(str);

			a.accept();
			return true;

		} catch (Exception e) {

			System.out.println("no alert ");
			return false;

		}
	}

	public boolean checkAlert_EnterAccept(String Value) {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert a = driver.switchTo().alert();
			String str = a.getText();
			System.out.println(str);

			a.sendKeys(Value);
			a.accept();
			return true;

		} catch (Exception e) {

			System.out.println("no alert ");
			return false;

		}
	}

	public boolean checkAlert_Dismiss() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert a = driver.switchTo().alert();
			String str = a.getText();
			System.out.println(str);

			a.dismiss();
			return true;

		} catch (Exception e) {

			System.out.println("no alert");
			return false;

		}
	}

	public void dragAndDrop(WebElement fromWebElement, WebElement toWebElement) {
		a.clickAndHold(fromWebElement).moveToElement(toWebElement).release(toWebElement).build().perform();

	}

	public void dragAndDropBy(WebElement fromWebElement, int xOffset, int yOffset) {
		a.dragAndDropBy(fromWebElement, xOffset, yOffset);
		a.perform();
	}

	public void resize(WebElement elementToResize, int xOffset, int yOffset) {	
		a.clickAndHold(elementToResize).moveByOffset(xOffset, yOffset).release().build().perform();
	}

	public void uploadafile(String Path) throws Exception {
		// File Need to be imported

		File file = new File(Path);

		StringSelection stringSelection = new StringSelection(file.getAbsolutePath());

		// Copy to clipboard
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
		// null);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		System.out.println("selection" + stringSelection);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_TAB);

		robot.delay(500);
		
		// Open Goto window

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyRelease(KeyEvent.VK_G);

		// Paste the clipboard value

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_V);

		// Press Enter key to close the Goto window and Upload window

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.delay(500);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
	}

public void Type(String Value) throws Exception {
		
		a.sendKeys(Value).build().perform();	

	}
	
	
	public String GetTextFromElement(WebElement ele) {
		return ele.getText();
	}

	public void SelectDateFromCalender(WebElement monthele, WebElement yearele, String date) {
		try {
			String[] dt = date.split("/");
			String month = FirstCharUppercase(Month.of(Integer.parseInt(dt[0])).name());
			String dd = dt[1].toString();
			String year = dt[2].toString();

			SelectByVisibleText(monthele,month);
			Select(yearele, year);
			links(driver.findElement(By.xpath("//div[(text()='"+dd+"') and contains(@aria-label ,'"+month+"')]")));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void Select(WebElement ele, String Value) {
		try {
			new Select(ele).selectByValue(Value);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public  void SelectByVisibleText(WebElement ele, String Value) {
		try {
			new Select(ele).selectByVisibleText(Value);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public  void SelectByIndex(WebElement ele, int Value) {
		try {
			new Select(ele).selectByIndex(Value);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void Radiobtn(List<WebElement> ele, String Value) {
		int size = ele.size();
		for (int i = 0; i <= size - 1; i++) {
			String text = ele.get(i).getAttribute("value");
			if (text.equalsIgnoreCase(Value)) {
				clickbyAction(ele.get(i));
				break;
			}

		}

	}
	
	public String FirstCharUppercase(String str) {

	  
	        // Create a char array of given String 
	        char ch[] = str.toCharArray(); 
	        for (int i = 0; i < str.length(); i++) { 
	  
	            // If first character of a word is found 
	            if (i == 0 && ch[i] != ' ' ||  
	                ch[i] != ' ' && ch[i - 1] == ' ') { 
	  
	                // If it is in lower-case 
	                if (ch[i] >= 'a' && ch[i] <= 'z') { 
	  
	                    // Convert into Upper-case 
	                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
	                } 
	            } 
	  
	            // If apart from first character 
	            // Any one is in Upper-case 
	            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
	  
	                // Convert into Lower-Case 
	                ch[i] = (char)(ch[i] + 'a' - 'A');             
	        } 
	  
	        // Convert the char array to equivalent String 
	        String st = new String(ch); 
	        return st; 
	}
}
