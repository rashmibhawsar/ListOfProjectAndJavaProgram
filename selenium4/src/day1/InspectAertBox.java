package day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException; 
import org.openqa.selenium.Alert;

public class InspectAertBox {
public static void main(String[] args) throws NoAlertPresentException,InterruptedException { 


	System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");

	driver.findElement(By.xpath("/html/body/button")).click(); 
	Alert alert = driver.switchTo().alert(); // switch to alert
	String alertMessage= driver.switchTo().alert().getText(); // capture alert message
	System.out.println(alertMessage); // Print Alert Message
	Thread.sleep(5000);
	alert.accept(); 
	}
}
/*package demo;

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

 

public class demo10 {

 

    public static void main(String[] args) throws InterruptedException {

        

        

        System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.AA-SD\\Downloads\\chromedriver_win32\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();

        

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);        

                

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");        

        

        driver.manage().window().maximize();

        

        //Switching to the iframe as the button is inside an iframe

        driver.switchTo().frame("iframeResult");

        

        driver.findElement(By.xpath("//button[text()='Try it']")).click();  

        

        //Switching to Alert window

        Alert alertBox  = driver.switchTo().alert();

        

        //Getting alert text message

        String alertText = alertBox.getText();

        

        //Accepting alert.It will click on the OK button

        alertBox.accept();        

        

        System.out.println("Alert Text: "+alertText);

        

       

        driver.quit();

    }

}

 */