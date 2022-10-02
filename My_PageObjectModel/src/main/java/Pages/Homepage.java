package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{

	WebDriver driver;
	
	public Homepage(WebDriver ldriver) 
	{
		//super();
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}
	@FindBy(xpath="//a[text()='Reports']")
	private WebElement reports;


	public void Employee() throws InterruptedException 
	{
		Thread.sleep(1000);
		reports.isDisplayed();
		System.out.println(reports.isDisplayed());
		Thread.sleep(2000);
		reports.click();

	}

}
