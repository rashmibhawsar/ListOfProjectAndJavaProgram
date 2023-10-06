package internal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButtons {
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.techlistic.com/p/selenium-practice-form.html");
		System.out.println(" WEBSITE OPENED...");
		
		WebElement n = driver.findElement(By.id("sex-1"));
		n.click();
		System.out.println("radio button selected selection of gender female");

		WebElement o = driver.findElement(By.id("exp-0"));
		o.click();
		System.out.println("experience 1 is selected");
}
}