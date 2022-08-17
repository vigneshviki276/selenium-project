package org.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class crome {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException  {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh\\org.Selenium\\driver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		//1 tshirt
		d.findElement(By.linkText("src=\"https://n3.sdlcdn.com/imgs/k/i/w/large/Flirt-Nx-Dark-Grey-Denim-SDL664650335-1-28ff0.jpg\"")).click();
		
		String parentWindowId = d.getWindowHandle();
		System.out.println("Parent Window ID:" + parentWindowId);
		//2 jwel
		d.findElement(By.xpath("")).click();
		
		//3 leg socks
		d.findElement(By.xpath("")).click();
		
		//4 usb
		d.findElement(By.xpath("")).click();
		
		
		Set<String> allWindowId = d.getWindowHandles();
		
		
		List<String> l=new ArrayList<String>(allWindowId);
		//By passing index we can switch the desired window
		d.switchTo().window(l.get(4));		
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[text()='buy now']")).click();
		
}
}