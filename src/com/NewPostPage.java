package com;

import org.openqa.selenium.By;

public class NewPostPage {

	public static String IsInEditMode() {
		return Driver.Instance.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/h1")).getText();
	}

}
