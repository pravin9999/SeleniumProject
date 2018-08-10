package com.AutomationScript;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class Home {
  @Test
  public void launchURL() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium ALL\\Selenium\\Browser Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		//driver.manage().window().maximize();
		Robot r = new  Robot();
		
		r.keyPress(java.awt.event.KeyEvent.VK_ESCAPE);
		r.keyRelease(java.awt.event.KeyEvent.VK_ESCAPE);
		driver.manage().window().maximize();
  }
}

