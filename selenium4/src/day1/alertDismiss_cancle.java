///not executed 
package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDismiss_cancle {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException { 

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");//becz they are two sections..its  a frame

		driver.findElement(By.xpath("/html/body/button")).click(); 
		System.out.println("try button is clicked");
		driver.findElement(By.xpath("/html/body/button"));
		//System.out.println("dissmiss message");
		Alert alert = driver.switchTo().alert();
		//driver.findElement(By.xpath("/html/body/script")).click();// switch to alert
		// capture alert message
		System.out.println("script message"); // Print Alert Message
		//Thread.sleep(5000);
		alert.dismiss(); 
		System.out.println("dismiss the alert box");
		}

}
