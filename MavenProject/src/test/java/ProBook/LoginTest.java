package ProBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	String url="http://probook.progideo.com";
	String expectedTitle1="Fil d'actualités - ProBook";
	String actualTitle1=null;
	String username="kenza";
	String password="kenza1412";
	String expectedTitle2="Fil d'actualités - ProBook";
	String actualTitle2=null;
	WebDriver driver;
	
	
	
	 
  
  
  
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\A632353\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver=new FirefoxDriver();
		
		driver.get(url);
  }

  
  
  @Test
  public void f() {
  
  driver.findElement(By.linkText("Se connecter / s'inscrire")).click();
	actualTitle1=driver.getTitle();
	System.out.println("Login page title : expected value is "+expectedTitle1+"actual value is "+actualTitle1);
	if(actualTitle1.contentEquals(expectedTitle1))
	{
		System.out.println("Test Failed");
	}
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	driver.findElement(By.id("login_username")).sendKeys(username);
	driver.findElement(By.id("login_password")).sendKeys(password);
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	driver.findElement(By.id("loginBtn")).click();
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	actualTitle2=driver.getTitle();
	System.out.println("Login result : expected value is "+expectedTitle2+" actual value is "+actualTitle2);
	if(!actualTitle2.contentEquals(expectedTitle2))
	{
		System.out.println("Test Failed");
	}
}
  
  
  
  @AfterMethod
  public void afterMethod() {
	  	  		
		
		driver.close();
  }

}
