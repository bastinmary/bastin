package stepDefn;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.ie.InternetExplorerDriver;


import cucumber.api.java.en.*;
import pageObj.LoginPageObj;
import pageObj.PostingsObj;
import pageObj.SearchObj;

public class StepDefn {
	public WebDriver driver;
	public LoginPageObj lp;
	public PostingsObj pp;
	public SearchObj sp;
	
	
	/*@Given("^User Launch FireFox browser$")
	public void user_Launch_FireFox_browser()  {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bmary\\Drivers\\geckodriver.exe");
		driver = new InternetExplorerDriver();
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver =new ChromeDriver(options);
        lp= new LoginPageObj(driver);
        pp= new PostingsObj(driver);
	}*/
	@Given("^User Launch chrome browser$")
	public void user_Launch_chrome_browser() 
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bmary\\chromedriver.exe");
		//driver = new ChromeDriver();
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver =new ChromeDriver(options);
        lp= new LoginPageObj(driver);
        pp= new PostingsObj(driver);
	}
	/*@Given("^User Launch Internet Explorer$")
	public void user_Launch_Internet_Explorer()  {
		System.setProperty("webdriver.ie.drive", "C:\\Users\\bmary\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver =new ChromeDriver(options);
        lp= new LoginPageObj(driver);
        pp= new PostingsObj(driver);
	}*/
	@When("^user opens URL \"(.*?)\"$")
	public void getURL(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user enters Email as \"(.*?)\" and Password as \"(.*?)\"$")
	public void getUser_Pass(String email, String pass)
	{
		lp.setEmail(email);
		lp.setPass(pass);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^Click on Login$")
	public void clickLogin() throws InterruptedException
	{
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Then("^Page Title should be \"(.*?)\"$")
	public void chkPageTitle(String title) 
	{
		System.out.println(lp.getPageTitle());
		Assert.assertEquals(title, lp.getPageTitle());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	/*@Then("^Capture Alert and Dismiss$")
	public void capture_Alert_and_Dismiss() 
	{
		//driver.switchTo().alert().getText();
		//Assert.assertEquals("Sh", lp.getPageTitle());
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
	}*/
	@When("^User Click on \"(.*?)\"$")
	public void user_Click_on(String arg1)
	{
		lp.selectName();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	
	@When("^Add posting \"(.*?)\"$")
	public void add_posting(String m) throws InterruptedException  {
		       
	        pp.postMsg(m);
	          }
	
	
	@When("^Search on FB \"(.*?)\"$")
	public void search_on_FB(String sname) {
		sp.Search_Name(sname);
	}
		   	
	@When("^Close Browser$")
	public void closeBrowser()
	
	{
		lp.clickLogout(); 			
		driver.close();
	}


	
}
