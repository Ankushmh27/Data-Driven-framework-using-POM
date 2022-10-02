package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class BaseClass 
{
	public String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public String UseName="Admin";
	public String PassWord="admin123";
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setupApplication()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jars\\Selenium webdriver_exe\\chromedriver.exe");

		System.out.println("=====Browser Session Started=====");

		driver=new ChromeDriver();
		driver.get(baseUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		System.out.println("=====Application Started=====");

	}
	
	
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
		System.out.println("=====Browser Session End=====");

	}

}