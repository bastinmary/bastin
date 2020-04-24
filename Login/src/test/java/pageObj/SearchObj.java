package pageObj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchObj {
public WebDriver driver;
	
	public SearchObj(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	public void Search_Name(String sname)
	{
		WebElement s=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/div/form/div/div/input"));
		s.sendKeys(sname);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/div/form/div/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
