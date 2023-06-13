package tesla_tests;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.*;
import tesla_pages.Tesla_objectpage;

public class Tesla_homepagetest extends Tesla_objectpage
{
	Tesla_objectpage obj;
 	@BeforeClass
	public void launch() throws IOException
	{
		Homepage();
		obj = new Tesla_homepagetest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test(priority=1)
	void verifyLogo()
	{
	boolean logo1 = obj.logo().isDisplayed();
	System.out.println("logo is visible : "+logo1);
	Assert.assertEquals(driver.getTitle(), "Electric Cars, Solar & Clean Energy | Tesla");
	}
	
	@Test(priority=2)
	void verifyTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		String expected = "Electric Cars, Solar & Clean Energy | Tesla";
		Assert.assertEquals(title, expected, "true");
	}
	
	@Test(priority=3)
	void checkImage()
	{
	boolean img = obj.image().isDisplayed();
	System.out.println("image is visible : "+img);
	Assert.assertEquals(driver.getTitle(), "Electric Cars, Solar & Clean Energy | Tesla");
	}
	
	@Test(priority=4)
	void selectModels()
	{
	obj.models_webelement().click();
	driver.navigate().forward();
	String title1 = driver.getTitle();
	Assert.assertEquals(title1, "Model S | Tesla");
	}
	
	@Test(priority=5)
	void modelsInformation() 
	{
		String a = obj.modelsinfo_webelement().getText();
		System.out.println("model information are : "+a);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/models");
		driver.navigate().back();
    }
	
	@Test(priority=6)
	void selectModel3()
	{
		obj.model3_webelement().click();
		String text = obj.model3text_webelement().getText();
		System.out.println(text);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/model3");
		
	}
	
	@Test(priority=7)
	void model3Information() throws InterruptedException
	{
		Thread.sleep(2000);
		String text = obj.model3info_webelement().getText();
		System.out.println(text);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/model3");
		driver.navigate().back();
	}
	
	@Test(priority=8)
	void selectModelX()
	{
		obj.modelx_webelement().click();
		String text1 = obj.modelxinfo_webelement().getText();
		System.out.println(text1); 
		String text3 = obj.ctext_webelement().getText();
		System.out.println(text3);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/modelx");
		driver.navigate().back();
	}
	
	@Test(priority=9)
	void selectModely()
	{
	obj.modely_webelement().click();
	String text = obj.gettext_webelement().getText();
	System.out.println(text);
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/modely");
	}
	
	@Test(priority=10)
	void modelyInformation()
	{
		String ytext = obj.modelyinfo_webelement().getText();
		System.out.println(ytext);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/modely");
	}
	
	@Test(priority=11)
	void solarRoof() throws InterruptedException
	{
		obj.Solarr_webelement().click();
		String text = obj.solartext_webelement().getText();
		System.out.println(text);
		String text2 = "Solar Roof";
		String text1 = obj.Solarinfo_webelement().getText();
		System.out.println(text1);
		Assert.assertEquals(text2, text);
		Thread.sleep(2000);
		
	}
	
	@Test(priority=12)
	void solarPanel()
	{
	driver.navigate().back();
	obj.Solarp_webelement().click();
	String text = obj.solarptext_webelement().getText();
	System.out.println(text);
	String text2 = obj.Solarpinfo_webelement().getText();
	System.out.println(text2);
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/solarpanels");
	}
	
	@Test(priority=13)
	void powerWallButton()
	{
		driver.navigate().back();
		obj.power_webelement().click();
		String text = obj.ptext_webelement().getText();
		System.out.println(text);
		String comp = "Powerwall";
		Assert.assertEquals(comp, text);
		String text2 = obj.pinfo_webelement().getText();
		System.out.println(text2);
	}
	
	@AfterClass
	void closure()
	{
	obj.close();	
	}
}
