package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.annotation.Super;

public class loginpage
{
	WebDriver driver;
	@FindBy(name ="username")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement clklogin;

	public loginpage(WebDriver ldriver) 	
	{
        //super();
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	

	public void setusername(String uname) 
	{

		username.sendKeys(uname);

	}
	public void setpassword(String upass) 
	{
		password.sendKeys(upass);

	}
	public void Loginbtn() 
	{
		clklogin.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
