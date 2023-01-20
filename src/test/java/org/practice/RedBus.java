package org.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	@Test
	public void main() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Banagalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mysuru");
		driver.findElement(By.xpath("//li[text()='Mysuru']")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[5]/td[4]")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		String value = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		String[] buses = value.split(" ");
		String bc = buses[0];
		int buscount = Integer.parseInt(bc);
		System.out.println(buscount);
		driver.findElement(By.xpath("//div[text()='View Buses']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"," ");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='column-two p-right-10 w-30 fl']"));
		int accurate = list.size();
		System.out.println(accurate);
		for (WebElement web : list) {
			System.out.println(web.getText());
			if(accurate==buscount)
			{
				System.out.println("TestCase is Pass");
			}
		}
		driver.quit();
	}
}
