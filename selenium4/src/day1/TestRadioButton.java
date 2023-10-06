package day1;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButton {
	public static void main(String[] args) {




		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang");
		System.out.println("site Element found !");
		WebElement r1 = driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[2]/div/label/i"));
		System.out.println("Element found radio1!");
		WebElement r2 = driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i"));
		System.out.println("Element found radio2 !");
		WebElement r3 = driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[5]/div/label/i"));
		System.out.println("Element found radio3 !");
		r1.click();
		if(r1.isSelected())
			System.out.println("selected ratio1 button english");
		else
			System.out.println("NOT selected ratio1 button english");
		r2.click();
		if(r1.isSelected())
			System.out.println("selected radio2 button english");
		else
			System.out.println("NOT selected ratio2 button english");
		
		
		
			
		
	}

}
/*public static void main(String[] args) {

// declaration and instantiation of objects/variables

     System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.AA-SD\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

  

String baseUrl = "http://demo.guru99.com/test/login.html";

driver.get(baseUrl);

// Get the WebElement corresponding to the Email Address(TextField)

WebElement email = driver.findElement(By.id("email"));

// Get the WebElement corresponding to the Password Field  

WebElement password = driver.findElement(By.name("passwd"));

email.sendKeys("abcd@gmail.com");

password.sendKeys("abcdefghlkjl");

System.out.println("Text Field Set");

  

// Deleting values in the text box

email.clear();

password.clear();

System.out.println("Text Field Cleared");

// Find the submit button

WebElement login = driver.findElement(By.id("SubmitLogin"));

  

// Using click method to submit form

email.sendKeys("abcd@gmail.com");

password.sendKeys("abcdefghlkjl");

login.click();

System.out.println("Login Done with Click");

 

//using submit method to submit the form. Submit used on password field

/* driver.get(baseUrl);

driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");

driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");

driver.findElement(By.id("SubmitLogin")).submit();

System.out.println("Login Done with Submit");

 

driver.close();  */


