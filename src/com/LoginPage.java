package com;

import org.openqa.selenium.By;

public class LoginPage {

	public static void goTo() {
		Driver.Instance.navigate().to("http://127.0.0.1:10080/wordpress/wp-login.php");
	}

	public static LoginCommand loginAs(String username) {
		return new LoginCommand(username);
	}

	static class LoginCommand {

		private String username;
		private String password;

		LoginCommand(String username) {
			this.username = username;
		}

		public LoginCommand withPassWord(String password) {
			this.password = password;
			return this;
		}

		public void login() {
			Driver.Instance.findElement(By.id("user_login")).sendKeys(username);
			Driver.Instance.findElement(By.name("pwd")).sendKeys(password);
			Driver.Instance.findElement(By.id("wp-submit")).click();
		}
	}

}