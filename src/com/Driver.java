package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
	public static WebDriver Instance;
	

	public static void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kiran\\eclipse-workspace\\WordpressAutomation\\assets\\chromedriver.exe");
		Instance = new ChromeDriver();
		Instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void deinint() {
		Instance.quit();
	}
	
	public static WebElement waitForElement(WebElement element,int waitTime) {
		WebDriverWait wait=new WebDriverWait(Instance, waitTime);
		WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		return webElement;
	}

}
