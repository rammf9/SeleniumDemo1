package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoToursLogin {
  @Test
  public void f() throws InterruptedException {
	  System.out.println("Helllo");
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.close();
  }
}
