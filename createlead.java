package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createlead {

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
	 
	 driver.findElementById("createLeadForm_firstName").sendKeys("nivas");
	 
      driver.findElementById("createLeadForm_lastName").sendKeys("s");
	 
	// driver.findElementByClassName("smallSubmit").click();
	 
	 
	 
	 
		
		
		//udername.sendKeys("9566151564");
		
		//WebElement udername1 = driver.findElementByClassName("_2hvTZ pexuQ zyHYP");
		
	//udername1.sendKeys("nivasinsta");
		
		//driver.findElementByClassName("  Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    \"><button class=\"sqdOP  L3NKy   y3zKF     \" disabled=\"\" type=\"submit\"><div class=\"                     Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                             ").click();
	}
}

