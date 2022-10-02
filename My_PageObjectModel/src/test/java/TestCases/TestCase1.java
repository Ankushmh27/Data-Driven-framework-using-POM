package TestCases;

import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.loginpage;

public class TestCase1 extends BaseClass 
{

	@Test(priority = 1,description="This TC will perform valid login")
	public void loginToApplication() throws InterruptedException 
	{
		loginpage lp =new loginpage(driver);
		lp.setusername(UseName);
		lp.setpassword(PassWord);
		lp.Loginbtn();

		System.out.println(driver.getTitle());
		Thread.sleep(5000);
	}
	@Test(priority = 2,description ="This TC will perform on home page")
	public void Employyee() throws InterruptedException 
	{

		Homepage hp = new Homepage(driver);
		hp.Employee();
		Thread.sleep(2000);

	}

}
