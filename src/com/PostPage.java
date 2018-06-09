package com;

import org.openqa.selenium.By;

public class PostPage {

	public static String title() {
		return Driver.Instance.findElements(By.tagName("h1")).get(0).getText();
	}

}
