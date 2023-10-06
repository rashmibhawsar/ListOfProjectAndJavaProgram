package day1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAllLocator {
	public static void main(String[] args) {




		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\Desktop\\celljar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://na.account.amazon.com/ap/signin?_encoding=UTF8&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.pape.max_auth_age=0&ie=UTF8&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=lwa&openid.assoc_handle=amzn_lwa_na&marketPlaceId=ATVPDKIKX0DER&arb=1dc38806-5fa1-4444-920b-c51e68de147b&language=en_US&openid.return_to=https%3A%2F%2Fna.account.amazon.com%2Fap%2Foa%3FmarketPlaceId%3DATVPDKIKX0DER%26arb%3D1dc38806-5fa1-4444-920b-c51e68de147b%26language%3Den_US&enableGlobalAccountCreation=1&metricIdentifier=amzn1.application.e3b40bcf8dae40e6bf8b197b9b3dec8d&signedMetricIdentifier=b1rnnUP4iinb%2B%2BwjCOWA1f5Y%2B6DlINB%2BDQCz1Q54AtU%3D");
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

		System.out.println("Login Done with Click");
		driver.get("https://www.selenium.dev/");
		WebElement searchBox = driver.findElement(By.linkText("DocSearch-Button-Placeholder"));
		searchBox.submit();
	}
	
}