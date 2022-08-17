package org.sample;	
import java.time.Duration;
import java.util.Set; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.Point; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 

	public class Ponthu { 
	public static void main(String[] args) throws Exception {


	System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\org.Selenium\\driver\\chromedriver.exe"); 
	
	WebDriver d = new ChromeDriver(); 
	d.get("https://www.facebook.com/"); 
	
	d.manage().window().maximize();
	
	
	WebElement em = d.findElement(By.xpath("(/html/body/div[1]/div[1]/div[1]/div/div/div/div/div)[2]/div[1]/form/div[1]/div[1]/input"));
	em.sendKeys("vikimass");

	
	WebElement pas = d.findElement(By.xpath("(/html/body/div[1]/div[1]/div[1]/div/div/div/div/div)[2]/div[1]/form/div[1]/div[1]/input//parent::div//following-sibling::div//div//input"));
	pas.sendKeys("nantha viki");
	
	WebElement ab = d.findElement(By.partialLinkText("Pay"));
    ab.click();
    
	
	
	
	}
	}
	
	
	
