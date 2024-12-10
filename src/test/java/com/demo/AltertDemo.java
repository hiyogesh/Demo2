package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AltertDemo {

	WebDriver driver;
	@Test
	public void Alt() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert al2=driver.switchTo().alert();
		Thread.sleep(2000);
		al2.dismiss();
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert al3=driver.switchTo().alert();
		al3.sendKeys("Green Altert Demo");
		Thread.sleep(2000);
		al3.accept();
		Thread.sleep(2000);
		String alt=driver.findElement(By.id("demo1")).getText();
		System.out.println(alt);
		
	}
}
