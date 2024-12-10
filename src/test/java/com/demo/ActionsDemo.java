package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {
	@Test
		public void main() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/buttons");
			Actions act=new Actions(driver);
			WebElement dc=driver.findElement(By.id("doubleClickBtn"));
			act.doubleClick(dc).perform();
			String DCmsg=driver.findElement(By.id("doubleClickMessage")).getText();
			System.out.println(DCmsg);
			Thread.sleep(2000);
			WebElement rc=driver.findElement(By.id("rightClickBtn"));
			act.contextClick(rc).perform();
			String RCmsg=driver.findElement(By.id("rightClickMessage")).getText();
			System.out.println(RCmsg);
			driver.quit();
	}

}
