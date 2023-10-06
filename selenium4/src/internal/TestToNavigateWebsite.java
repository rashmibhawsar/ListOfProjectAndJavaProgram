package internal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToNavigateWebsite {
	public static void main(String[] args) {




		//set the path of executable browser driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.techlistic.com/p/selenium-practice-form.html");
		System.out.println(" WEBSITE OPENED...");
		WebElement e = driver.findElement(By.name("firstname"));
		e.click();
		System.out.println("Element found first name");//*[@id="ap_email"]
		e.sendKeys("rashmi");
		System.out.println("Text Field Set to rashmi");
		
		WebElement m = driver.findElement(By.name("lastname"));
		m.click();
		System.out.println("Element found last name");
		m.sendKeys("bhawsar");
		System.out.println("Text Field Set to bhawsar");
		
		
		WebElement n = driver.findElement(By.id("sex-1"));
		n.click();
		System.out.println("radio button selected selection of gender female");

		WebElement o = driver.findElement(By.id("exp-0"));
		o.click();
		System.out.println("experience 1 is selected");
		
		
		WebElement p = driver.findElement(By.id("datepicker"));
		p.click();
		System.out.println("Element found date feild");
		p.sendKeys("05-05-2023");
		System.out.println("todays date is selected");
		
		
		WebElement q = driver.findElement(By.id("profession-0"));
		q.click();
		System.out.println("manual tester is selected is selected");
		
		// dropbox test
        WebElement r = driver.findElement(By.id("continents"));
        r.findElement(By.xpath("//option[. = 'South America']")).click();
        System.out.println("south america is selected is selected");
        
        
        WebElement s = driver.findElement(By.id("selenium_commands"));
        s.findElement(By.xpath("//option[. = 'WebElement Commands']")).click();
        System.out.println("webelement is selected is selected from dropdown");
        
        driver.findElement(By.id("submit")).click();
        System.out.println("submitted form");
	}
}
