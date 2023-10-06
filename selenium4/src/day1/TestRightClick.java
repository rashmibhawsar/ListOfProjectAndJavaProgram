package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement element = driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		System.out.println("Right click Context Menu displayed");
		WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
		elementOpen.click(); 

		Thread.sleep(5000);
		
	}
}