package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) throws InterruptedException {
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	
	//load the url
	driver.get("http://leaftaps.com/opentaps/");
	
	//Maximize the window
	driver.manage().window().maximize();
	
	//Locate the Username
	driver.findElement(By.className("inputLogin")).sendKeys("Democsr");
	
	//Wait
	Thread.sleep(3000);
	
	//Locate the Password
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	//click login
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//Verify the title
	String title = driver.getTitle();
	System.out.println(title);
	if(title.contains("TestLeaf")){
	    System.out.println("Leaftaps Login successfully");
	}else {
		System.out.println("Login failed");
	}
	
	//Click CRM/SFA
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//Click Leads tab
	driver.findElement(By.linkText("Leads")).click();
	
	//Click Create Lead
    driver.findElement(By.linkText("Create Lead")).click();
    
    //Enter Company name
    WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
    companyName.sendKeys("TestLeaf");
    
    //Enter the first name
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
    
    //Enter the Last name
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
    
    //Click on create lead
    driver.findElement(By.className("smallSubmit")).click();
    
    //closing the window
    driver.close();

	}

}
