package tesla_tests;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.*;
import tesla_pages.Tesla_login_object;

public class Tesla_logintest extends Tesla_login_object
{
	Tesla_login_object obj;
	
	@BeforeClass
	public void launch() throws IOException
	{
		Homepage();
		obj = new Tesla_logintest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
	}
	
	@Test(priority=1)
	void clickAccount() throws InterruptedException
	{
		driver.get(prop.getProperty("Createaccounturl"));
		System.out.println("create new account page is opened");
		String Actualtext = obj.Createtext().getText();
		String Expectedtext = "Create Account";
		Assert.assertEquals(Expectedtext,Actualtext );
	}
		
	@Test(priority=2)
	void enterData() throws InterruptedException
	{
		obj.Firstnam().sendKeys("Sakshi");
		Thread.sleep(2000);
		obj.Lastnam().sendKeys("Choubey");
		Thread.sleep(2000);
		obj.Captcha().click();
		Thread.sleep(8000);     // manually enter
		obj.Next().click();
		Assert.assertEquals(driver.getTitle(), "Tesla SSO - Register");
	}
	
	@Test(priority=3)
	void enterEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		obj.Emailenter().sendKeys("abc16@gmail.com");
		System.out.println("Email entered successfully");
		Assert.assertEquals(driver.getTitle(), "Tesla SSO - Register");
	}
	
	@Test(priority=4)
	void enterPassword() throws InterruptedException
	{
		obj.Password().sendKeys("abc@1489");
		Thread.sleep(2000);
		obj.Showpass().click();
		obj.Password2().sendKeys("abc@1489");
		obj.Showpass2().click();
		obj.Signin().click();
	}
	
    @AfterClass
	void closure()
	{
	obj.close();	
	}
}
