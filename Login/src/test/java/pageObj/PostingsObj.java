package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostingsObj {
public WebDriver driver;
	
	public PostingsObj(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	public void postMsg(String message) throws InterruptedException
	{
		 WebElement status =driver.findElement(By.xpath("//textarea[@name='xhpc_message']"));
         status.sendKeys(message);
         Thread.sleep(3000);
         WebDriverWait wait = new WebDriverWait(driver,30);
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Post']"))).click();
	}
}
