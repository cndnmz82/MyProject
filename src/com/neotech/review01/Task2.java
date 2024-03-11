package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// Go to https://demoqa.com/text-box
		// Fill the form and submit
		// Use xPath or CSS Selector

		WebDriver driver = new FirefoxDriver();

		String url = "https://demoqa.com/text-box";
		driver.get(url);

		driver.findElement(By.cssSelector("input#userName")).sendKeys("Donald Trump");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("donald@maga.com");

		// Even though there are 2 elements, we will get the first one in the DOM
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Mar a Lago");

		// Find an elements by using multiple attributes
		// css -> textarea[class='form-control'][id='currentAddress']
		// xPath -> //textarea[@class='form-control' and @id='currentAddress']
		driver.findElement(By.xpath("//textarea[@class='form-control' and @id='permanentAddress']")).sendKeys("Jail");

		Thread.sleep(3000);

		driver.findElement(By.id("submit")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
