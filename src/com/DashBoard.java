package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBoard {

	public static boolean isAt() {
		List<WebElement> h1s=Driver.Instance.findElements(By.tagName("h1"));
		
		if(h1s.get(0).getText().equals("Dashboard"))
			return true;
		else
			return false;
	}

}
