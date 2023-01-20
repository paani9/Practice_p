package org.practice;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeLine {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20l));
		
		   driver.get("https://scbqa.grouphour.com/scbqa/login");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10l));
		
		   driver.findElement(By.xpath("//input[@name='UserId']")).sendKeys("scbqahkrm1");
		    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("scbqahkrm1123");
		    driver.findElement(By.xpath("//a[text()='Log In']")).click();
		    Thread.sleep(2000);
		    if(!driver.findElements(By.className("error-text")).isEmpty())
	        {
	            driver.findElement(By.id("Password")).sendKeys("scbqahkrm1123");
	            driver.findElement(By.xpath("//a[text()='Log In']")).click();
	        }
		  
		    
		    driver.findElement(By.xpath("//button[@class='btn btn-primary rmtimelinesearch']")).click();
		    WebElement search = driver.findElement(By.xpath("//input[@id='timeline_global_search_text']"));
		    wait.until(ExpectedConditions.visibilityOf(search));
		    search.sendKeys("Test");
		    driver.findElement(By.xpath("//div[@id='timeline_global_search_btn']")).click();
		    driver.findElement(By.xpath("//div[normalize-space(text())='Test']")).click();
		    
		    WebElement frame=driver.findElement(By.xpath("//iframe[@src='https://scbqa.grouphour.com/service/#api.ui.binder/BufQPYlIV0D9kk19QWotxvD?client_id=NGMzZjY2MTM&type=websdk&origin=https%3A%2F%2Fscbqa.grouphour.com&tab=tab_chat&plugin_version=latest&tags_exclude=API_DELETED&security=true']"));
		    driver.switchTo().frame(frame);
		    		
		    WebElement sendmsg=driver.findElement(By.xpath("//textarea[@placeholder='Send Message']"));
		
		    wait.until(ExpectedConditions.visibilityOf(sendmsg));
		
            Actions act=new Actions(driver);
        
            act.moveToElement(sendmsg).build().perform();
            sendmsg.click();
            sendmsg.sendKeys("Hello");   
            Thread.sleep(1000);
            sendmsg.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm mr-2 dropdown-toggle timelineCallOptions binder_calls_options main_call_icon']")).click();
		    System.out.println("pass");
		    driver.switchTo().parentFrame();
	     	driver.close();
		
	}

}
