
package day1;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_WaitCommand {
	public static void main(String[] args) throws InterruptedException{




		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10,1));//implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("wait for 30 seconds");
		WebElement b = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		b.sendKeys("shop");
		System.out.println("google search button is Click");
		Thread.sleep(5000);
		driver.quit();
		//b.click();// check button

		
	}
}
/*package demo;

import java.util.concurrent.TimeUnit;

import java.util.Date;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class demo9 {

    public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.AA-SD\\Downloads\\chromedriver_win32\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

 

 

// Loading a URL

driver.get("https://www.redbus.in/");

 

// Locating and typing in From text box.

WebElement fromTextBox= driver.findElement(By.id("src"));

fromTextBox.sendKeys("Ban");

 

Thread.sleep(5000);

driver.quit();

}

}*/