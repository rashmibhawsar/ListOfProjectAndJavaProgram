package internal;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testdate {
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
		
	    WebElement r = driver.findElement(By.id("ez-video-31f309e3a5e0a68dd5f867946f0c8abc03a3775fe65155f698b4a5fdd46a60a8_html5_api"));
		r.click();
		System.out.println("video window is selected");
		

        
	}
}
        

		
		
		
		
		
		
		/*WebElement q = driver.findElement(By.name("lastname"));
		q.click();
		System.out.println("Element found last name");
		q.sendKeys("bhawsar");
		System.out.println("Text Field Set to bhawsar");*/
		
		
		
		
        //.click();
        //driver.findElement(By.name("firstname")).sendKeys("RASHMI");
		

/*
//WebElement e = driver.findElement(By.id("ap_email"));
WebElement e = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
System.out.println("Element found email!");//*[@id="ap_email"]
WebElement p = driver.findElement(By.id("ap_password"));
System.out.println("Element found password !");
//WebElement b = driver.findElement(By.id("signInSubmit"));
WebElement b = driver.findElement(By.cssSelector("#signInSubmit"));
e.sendKeys("rashmibhawsar3884mail.com");
p.sendKeys("rashmi");
System.out.println("Text Field Set");
e.clear();

p.clear();
b.click();// check button

System.out.println("Login Done with Click");*/