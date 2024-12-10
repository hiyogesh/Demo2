package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumBasic {
	WebDriver driver;
	@Test
	public void demo() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		WebElement Year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select year=new Select(Year);
		year.selectByValue("2020");
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select mon=new Select(month);
		mon.selectByValue("0");
		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, January 23rd, 2020']")).click();
	}

}
