package day1;

public class TestExplicityWait {

}
/*package demo;

import java.util.concurrent.TimeUnit;

import java.util.Date;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class demo11 {

public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC.AA-SD\\Downloads\\chromedriver_win32\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();

        driver.get("https://google.com/");

        

        // Defining Explicit Wait

        WebDriverWait wait = new WebDriverWait(driver,20);

        

        WebElement searchTextBox;

        

        //Waiting until the search text box becomes visible

        searchTextBox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name( "q")));

        

        driver.findElement(By.name("q")).sendKeys("cherry" + Keys.ENTER);

        

        WebElement firstSearchResult = driver.findElement(By.tagName("h3"));

        System.out.println("First Search Result with Cherry is : "+firstSearchResult.getAttribute("textContent"));

        driver.quit();

}}

 */