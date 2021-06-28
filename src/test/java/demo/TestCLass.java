package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCLass {
	
	WebDriver driver=null;
	
	@Test
	public void A1()
	{
		System.out.println("First test cases executed");
		
		System.out.println("test1");
	    String path=System.getProperty("user.dir");
	    System.out.println("the path is: "+path);
	    System.setProperty("webdriver.chrome.driver",path+"/drivers/chromedriver.exe");
	    //C:\Users\alimi\workspace12\Jenkins_practice\drivers
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://www.google.com");
	    driver.quit();
	}
	
	@Test
	public void A2()
	{
		System.out.println("Second test cases executed");
	}
	
	@Test
	public void A3()
	{
		System.out.println("Third test cases executed");
	}
	
	@Test
	public void A4()
	{
		System.out.println("Fourth test cases executed");
	}

}
