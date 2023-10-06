package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSearch {
	public static void main(String[] args) {



		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("Element found!");
		searchBox.sendKeys("Iphone SE");
		System.out.println("Element search found!");
		driver.findElement(By.xpath("/html/body"));
		System.out.println("Xpath Element found!");
		driver.findElement(By.linkText("Home"));
		System.out.println("Element found!");
		searchBox.submit();

}

}
/*public class demo3 {

public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.AA-SD\\Downloads\\chromedriver_win32\\chromedriver.exe");

 

    WebDriver driver = new ChromeDriver();

driver.get("https://demoqa.com/automation-practice-form");

driver.findElement(By.id("firstName"));

System.out.println("Element found!");

driver.get("https://demoqa.com/automation-practice-form");

driver.findElement(By.name("gender"));

System.out.println("Element found!");

driver.get("https://demoqa.com/automation-practice-form");

driver.findElement(By.className("practice-form-wrapper"));

System.out.println("Element found!");

driver.get("https://demoqa.com/links");

driver.findElement(By.linkText("Home"));

System.out.println("Element found!");

driver.get("https://demoqa.com/text-box");

driver.findElement(By.xpath("//input[@id='userName']"));

System.out.println("Element found!");

driver.close();

}}*/