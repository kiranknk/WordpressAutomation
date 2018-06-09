package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class NewPostsPage {

	public static void goTo() throws Exception{
		Driver.Instance.findElement(By.xpath("//*[@id='menu-posts']/a")).click();
	}

	public static CreatePostCommand createPost(String postTitle, String postBody) {
		// TODO Auto-generated method stub
		return new CreatePostCommand(postTitle,postBody);
	}
	
	static class CreatePostCommand{
		private String postTitle;
		private String postBody;
		
		CreatePostCommand(String postTitle,String postBody){
			this.postTitle=postTitle;
			this.postBody=postBody;
		}

		public void publish() {
			Driver.Instance.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a")).click();
			enterKeys("title-prompt-text",postTitle);
			enterKeys("mceu_25-body",postBody);
			
//			Driver.waitForElement(Driver.Instance.findElement(By.id("publish")),10).click();
		
			clickButton("publish");
		}
		
		private void enterKeys(String id,String keys) {
			Actions actions = new Actions(Driver.Instance);
			actions.moveToElement(Driver.Instance.findElement(By.id(id)));
			actions.click();
			actions.sendKeys(keys);
			actions.build().perform();
		}
		
		private void clickButton(String id) {
			Actions actions = new Actions(Driver.Instance);
			actions.moveToElement(Driver.Instance.findElement(By.id(id)));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			actions.click();
			actions.build().perform();
		}
	}

	public static void goToNewPost() {
		Driver.Instance.findElement(By.xpath("//*[@id=\"message\"]/p/a")).click();
	}

	public static String Title() {
		return Driver.Instance.findElement(By.id("title")).getAttribute("value");
	}
}
