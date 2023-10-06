package internal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScrollBar {
	public static void main(String[] args) {




		//set the path of executable browser driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.techlistic.com/p/selenium-practice-form.html");
		System.out.println(" WEBSITE OPENED...");

		
		// dropbox test
        WebElement r = driver.findElement(By.id("continents"));
        r.findElement(By.xpath("//option[. = 'South America']")).click();
        System.out.println("south america is selected is selected");
        
        
        WebElement s = driver.findElement(By.id("selenium_commands"));
        s.findElement(By.xpath("//option[. = 'WebElement Commands']")).click();
        System.out.println("webelement is selected is selected from dropdown");
        }
}