package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		//This code will open a Mozilla FirefoxDriver
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.nytimes.com/games/wordle/";
		
		//It will navigate to specific web site
		driver.get(url);
		
		//wait for 2 second then close the browser
		Thread.sleep(2000);
		
		//Gets the current url of the web site
		String currentUrl = driver.getCurrentUrl();
		if (url.equals(currentUrl)) {
			System.out.println("Url are the same");
			
		}else {
			System.out.println("Url is different!");
		}
		System.out.println("url -> " + url);
		System.out.println("url2 -> " + currentUrl);
		
		//Get the web site title
		
		String title = driver.getTitle();
		System.out.println("Title -> " + title);
		
		//Quit(close) the browser
		driver.quit();
		
		
	}
}
