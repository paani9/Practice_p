package org.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Editor {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.programiz.com/javascript/online-compiler/");
		WebElement in = driver.findElement(By.xpath("//div[.='main.js']/parent::div/following-sibling::div[@id='editor']"));
		in.clear();
		in.sendKeys("var a=10;var b=30;console.log(a+b)");
		WebElement runBtn = driver.findElement(By.xpath("//span[contains(text(),'Run')]"));
		runBtn.click();
		List<WebElement> res = driver.findElements(By.xpath("//span[text()='node /tmp/mA7H2FiFbp.js']/ancestor::div[@class='ace_line_group']/following-sibling::div/div"));
		for(WebElement re:res)
		{
			String result = re.getText();
			if(result==null)
			{
				break;
			}
			else
			{
				System.out.println(result);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
		

}
