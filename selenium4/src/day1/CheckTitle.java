package day1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTitle {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		String baseUrl = "https://www.bigbasket.com/";

		String expectedTitle = "Online Grocery Shopping and Online Supermarket in India - bigbasket";

		String actualTitle = "";

		driver.get(baseUrl);
		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)){

		System.out.println("Test Passed!");

		} else {

		System.out.println("Test Failed");

		}

		}
}


