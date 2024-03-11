package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.instagram.com/";
		
		//driver.get(url);
		// will wait for the page and the elements to be loaded
		//it will not keep the history
		
		driver.navigate().to(url);
		// will not wait for the page and the elements to be loaded
		//it will  keep the history
		Thread.sleep(1000);
		
		driver.manage().window().fullscreen(); // will make full screen
		Thread.sleep(1000);
		
		driver.manage().window().minimize();
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.navigate().to("https://www.mlssoccer.com/");
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.fifa.com/fifaplus/en");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
