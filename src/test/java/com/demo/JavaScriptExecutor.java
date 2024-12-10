package com.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://www.firstcry.com/");
	WebElement act=driver.findElement(By.xpath("(//div[@class='menu-container']/ul/li)[5]"));
	Actions act1=new Actions(driver);	
	act1.moveToElement(act).perform();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Musical Toys")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("Babyhug Happy Penguin Track Set with Music and Light ...")));
	driver.findElement(By.linkText("Babyhug Happy Penguin Track Set with Music and Light ...")).click();
}
}