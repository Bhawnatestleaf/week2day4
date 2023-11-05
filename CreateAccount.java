package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//Lauch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(3000);
		
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Locate the username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		Thread.sleep(3000);
		
		//Locate the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		
		//wait
		Thread.sleep(3000);
		
		
		//Enter login 
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		
		//Click Account
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		
		//Click create account
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(3000);
		
		//Locate account name
		driver.findElement(By.id("accountName")).sendKeys("Bhawna");
		Thread.sleep(3000);
		
        //Locate description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Thread.sleep(3000);
	
		//Select industry Dropdown
	WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select industry=new Select(industryDD);
		 industry.selectByValue("IND_SOFTWARE");
		Thread.sleep(3000);
		
		//select ownership DD
		
	WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
	Select ownership=new Select(ownershipDD);
	ownership.selectByVisibleText("S-Corporation");
	Thread.sleep(3000);
	
	//Select SourseDD
	WebElement sourceDD=driver.findElement(By.name("dataSourceId"));
	Select source=new Select(sourceDD);
	source.selectByIndex(6);
	Thread.sleep(3000);
	
	//Select marketing
	WebElement marketingDD=driver.findElement(By.name("marketingCampaignId"));
	Select marketing=new Select(marketingDD);
	marketing.selectByIndex(6);	 
	Thread.sleep(3000);
	
	//Select state province
	WebElement stateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
	Select state=new Select(stateDD);
	state.selectByValue("TX");
	Thread.sleep(3000);
	
	//Click create account
	driver.findElement(By.className("smallSubmit")).click();
	Thread.sleep(3000);
	
	//Close
	driver.close();
		

		
		
	}

}
