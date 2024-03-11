package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchCSS {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.amazon.com/";
		driver.get(url);

		Thread.sleep(2000);

		// # (hashtag) means id

		// input#twotabsearchtextbox -> any input with id = twotabsearchtextbox
		// #twotabsearchtextbox -> any element with id = twotabsearchtextbox

		// . (period) means class
		// input.nav-input -> input with class nav-input
		// .nav-input -> any element with class nav-input

		WebElement searchText = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchText.sendKeys("Backgamon");
		Thread.sleep(1000);

		// span#nav-search-submit-text > input
		// Locate the span with id = nav-search-submit-text
		// Locate direct-child input

		// Method chaining: locating the WebElement and clicking on it
		driver.findElement(By.cssSelector("span#nav-search-submit-text > input")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
