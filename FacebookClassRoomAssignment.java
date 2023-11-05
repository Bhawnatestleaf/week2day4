package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookClassRoomAssignment {

	public static void main(String[] args) throws InterruptedException {

    //Launch the browser
	ChromeDriver driver=new ChromeDriver();
	
	//Load the url
	driver.get("https://www.facebook.com/");
	
	//Maximise Window
  driver.manage().window().maximize();
  
    //To locate Email
  driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");

    //To locate password
  driver.findElement(By.id("pass")).sendKeys("Tuna@321");
  
    //to locate login
  driver.findElement(By.name("login")).click();
  
    //Find your account and log in
  driver.findElement(By.linkText("Find your account and log in"));
  
     //Get title and verify
  String title=driver.getTitle();
  System.out.println(title);
  
  if(title.contains("Forgotton")) {
	  System.out.println("The Title is right");
  }
	}
}

  
  