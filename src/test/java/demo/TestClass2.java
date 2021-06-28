package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass2 {
	WebDriver driver=null;
	
	@Test
	public void B1()
	{
		System.out.println("Eleven test cases executed");
		
	System.out.println("First test cases executed");
		
		System.out.println("test1");
	    String path=System.getProperty("user.dir");
	    System.out.println("the path is: "+path);
	    System.setProperty("webdriver.chrome.driver",path+"/drivers/chromedriver.exe");
	    //C:\Users\alimi\workspace12\Jenkins_practice\drivers
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://www.facebook.com");
	    
	    driver.quit();
	}
	
	@Test
	public void B2()
	{
		System.out.println("Twelve test cases executed");
	}
	
	@Test
	public void B3()
	{
		System.out.println("Thirdteen test cases executed");
	}
	
	@Test
	public void B4()
	{
		System.out.println("Fourthteen test cases executed");
	}


}
