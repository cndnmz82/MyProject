package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().to("https://www.google.com/");
		for (int i = 0; i <= 10; i++) {
			driver.navigate().back();
			Thread.sleep(100);
		
		
		
		driver.navigate().forward();
		Thread.sleep(100);
		
		}
		
		driver.quit();
	}
}
