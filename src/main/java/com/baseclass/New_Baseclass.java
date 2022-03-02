package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class New_Baseclass {
	
	public static WebDriver driver;
	public static String value;
	
	//launch
	public static WebDriver browserlaunch(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\driver\\chromedriver.exe");
				
				 driver =new ChromeDriver();		
		}
            driver.manage().window().maximize();
            return driver;
	}
	
	//urllaunch
	public static WebDriver launch(String url) {
		
		driver.get(url);
		return driver;
	}
	
	//wait
	public static void waitinseconds() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	//navitage
	public static void moveto(String url) {
		driver.navigate().to(url);
	}
	//sendkeys
	public static  void input(WebElement element, String value) {
		
		element.sendKeys(value);
	}
	
	//click
	public static  void  login(WebElement element) {
		element.click();
	}
	
	//dropdown
	public static void dropdown(String type,WebElement element, String value) {
		Select s=new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
			
		}
		else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);	
		}
		else if (type.equalsIgnoreCase("byindex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}

	}
	
	//keyboard actions
	public static void keyboard(WebElement element) throws AWTException {
		element.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	//mouse actions
	public static void mouse(WebElement element) {
		element.click();
		Actions a=new Actions(driver);
		a.moveToElement(element);
	}
	
	//CLOSE
	public static void close() {
		 driver.close();
	}
	
	//quit
	public static void quit() {
		driver.quit();
	}
	
	//clear
	public static void clear(WebElement element) {
		element.clear();
	}
	
	//alert
	public static void alert() {
		driver.switchTo().alert().accept();
	}
	//is enable
	public static void enable(WebElement element) {
		boolean b = element.isEnabled();
		System.out.println(b);
	}
    //is displayed
	public static void display(WebElement element) {
	System.out.println(element.isDisplayed());
	}
	//is select
	public static void select(WebElement element) {
		boolean selected = element.isSelected();
       System.out.println(selected);
	}
	
	//get text
	public static void text(WebElement element) {
		String s = element.getText();
		System.out.println(s);
	}
	
	//get title
	public static void title() {
		System.out.println(driver.getTitle());
	}
	
	//current url
	public static void current_url() {
		System.out.println(driver.getCurrentUrl());
	}
	
	//get page source
	public static void page_source() {
		System.out.println(driver.getPageSource());
	}
	
	//get attribute
//	public static void attribute(WebElement element) {
//		System.out.println(element.getAttribute());
//	}
	
	//is multiple
	public static void multiple(WebElement element) {
		Select s=new Select(element);
		boolean mul = s.isMultiple();
         System.out.println(mul);
	}
	
	//get options
	public static void get_options(WebElement element) {
		Select s=new Select(element);
		List<WebElement> all = s.getOptions();
		System.out.println(all);
	}
	
	//sleep
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	//takes screen shot
   public static void screenshot() throws IOException {
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   File destination=new File("C:\\Users\\venkatesh\\eclipse-workspace\\cucumber_12pm\\screenshot\\image.png");
	   FileUtils.copyFile(source, destination);
}
   
	// java script excutor
    public static void java_script() {
    	JavascriptExecutor js= (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(100,100)");

	}
    
   

}
   
   

