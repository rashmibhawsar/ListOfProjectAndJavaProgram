package day1;

/*import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;*/

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.Select;

public class demoExample_DropDown {
	public static void main(String[] args) {




		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
		System.out.println("site Element found!");
	
		Select drpCountry = new Select(driver.findElement(By.id("auth-country-picker")));
		System.out.println("Element search country found!");
		
		drpCountry.selectByIndex(0);


		System.out.println("Element found!");
		}
	

}

/*auth-country-picker_92"/
 * public static void main(String[] args) {  


     System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.AA-SD\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

String baseURL = "http://demo.guru99.com/test/newtours/register.php";

driver.get(baseURL);

Select drpCountry = new Select(driver.findElement(By.name("country")));

drpCountry.selectByVisibleText("ANTARCTICA");

System.out.println("tEST PASSED!");

drpCountry.selectByIndex(0);

System.out.println("tEST PASSED");

drpCountry.selectByValue("ANGOLA");

System.out.println("tEST PASSED");

//Selecting Items in a Multiple SELECT elements

/*driver.get("http://jsbin.com/osebed/2");

Select fruits = new Select(driver.findElement(By.id("fruits")));

fruits.selectByVisibleText("Banana");

fruits.selectByIndex(1);

driver.close(); */



