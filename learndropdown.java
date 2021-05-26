package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learndropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       // open chrome browser - create object for chromeDrive
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
	 WebElement username = driver.findElementById("username");
	 
	 username.sendKeys("demosalesmanager");
	 
	 driver.findElementById("password").sendKeys("crmsfa");
	 
	 driver.findElementByClassName("decorativeSubmit").click();
	 
	 driver.findElementByLinkText("CRM/SFA").click();
	 
	 driver.findElementByLinkText("Leads").click();
	 
	 driver.findElementByLinkText("Create Lead").click();
	 
	 driver.findElementById("createLeadForm_companyName").sendKeys("vidal health");
	 
	 driver.findElementById("createLeadForm_firstName").sendKeys("Nivas");
	 
      driver.findElementById("createLeadForm_lastName").sendKeys("S");
      
      WebElement source = driver.findElementById("createLeadForm_dataSourceId");
      
      Select dropDown = new Select(source);
      
      dropDown.selectByVisibleText("Employee");
      
      driver.findElementByName("annualRevenue").sendKeys("600000");
      
      WebElement industry = driver.findElementByName("industryEnumId");
      
      Select dropDown1 = new Select(industry);
      
      dropDown1.selectByVisibleText("Health Care");
      
      WebElement currency = driver.findElementByName("currencyUomId");
      
      Select dropDown2 = new Select(currency);
      
      dropDown2.selectByVisibleText("INR - Indian Rupee");
      
      WebElement ownerShip = driver.findElementByName("ownershipEnumId");
      
      Select dropDown3 = new Select(ownerShip);
      
      dropDown3.selectByVisibleText("Sole Proprietorship");
      
      driver.findElementById("createLeadForm_primaryEmail").sendKeys("nivasnathan2308@gmail.com");
      
      driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
      
      driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9566151564");
      
      driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://www.vidalhealthtpa.com/home.html");
	 
      WebElement country = driver.findElementByName("generalCountryGeoId");
      
      Select dropDown4 = new Select(country);
      
      dropDown4.selectByVisibleText("India");
      
      WebElement marketing = driver.findElementByName("marketingCampaignId");
      
      Select dropDown5 = new Select(marketing);
      
    dropDown5.selectByVisibleText("eCommerce Site Internal Campaign");
      
	 driver.findElementByClassName("smallSubmit").click();
	 
	 
	 
	 
		
		
		//udername.sendKeys("9566151564");
		
		//WebElement udername1 = driver.findElementByClassName("_2hvTZ pexuQ zyHYP");
		
	//udername1.sendKeys("nivasinsta");
		
		//driver.findElementByClassName("  Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    \"><button class=\"sqdOP  L3NKy   y3zKF     \" disabled=\"\" type=\"submit\"><div class=\"                     Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                             ").click();
	}
}

