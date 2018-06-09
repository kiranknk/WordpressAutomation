package com;

import org.openqa.selenium.By;

public class ListPostsPage {

	public static void goTo(PostType page) {
		switch (page) {
		case Page:Driver.Instance.findElement(By.id("menu-pages")).click();;
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

	public static void selectPost(String linkText) {
		Driver.Instance.findElement(By.linkText(linkText)).click();
	}

}
