package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObj {
	
	public WebDriver driver;
	
	public LoginPageObj(WebDriver driver)
	{
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='email']")
	@CacheLookup
	WebElement e;
	
	@FindBy(xpath="//*[@id='pass']")
	@CacheLookup
	WebElement p;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/div/div/div[2]/form/div/div[3]/button")
	@CacheLookup
	WebElement l;
	
	By bs=By.xpath("//*[@id='navItem_1677091958']/a/div");
	By LogoutLink=By.xpath("//*[@id='userNavigationLabel']");
	public String getPageTitle()
	{
		return driver.getTitle();
		
	}
	public void setEmail(String email)
	{
		e.clear();
		e.sendKeys(email);
	}
	
	public void setPass(String pass)
	{
		p.clear();
		p.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		l.click();
	}
	public void selectName()
	{
		driver.findElement(bs).click();
		}
	public void clickLogout()
	{
		driver.findElement(LogoutLink).click();
	}
	

}
