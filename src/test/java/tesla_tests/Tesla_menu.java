package tesla_tests;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import tesla_pages.Tesla_objectpage;

public class Tesla_menu extends Tesla_objectpage
{
Tesla_objectpage obj;
	
	@BeforeClass
	public void launch() throws IOException
	{
		Homepage();
		obj = new Tesla_menu();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	// for existing inventory module
	
	@Test(priority=1)
	void clickmenu()
	{
	 obj.menu().click();
	 Assert.assertEquals(driver.getTitle(), "Electric Cars, Solar & Clean Energy | Tesla");
	}
			
	@Test(priority=1,dependsOnMethods= {"clickmenu"})
	void clickitem1()
	{
	obj.menuitem1().click();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertEquals(url, "https://www.tesla.com/inventory/new/m3");
	}
			
	@Test(priority=1,dependsOnMethods= {"clickitem1"})
	void verifytext()
	{
	String h1 = obj.heading1().getText();
	String h2 = "Inventory";
	Assert.assertEquals(h1, h2);
	}
			
	@Test(priority=1,dependsOnMethods= {"verifytext"})
	void sortprice()
	{
	Select object = new Select(obj.sort());
	object.selectByVisibleText("Price : high to low ");
	System.out.println("price is selected");
	Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
	}
			
	@Test(priority=1,dependsOnMethods= {"sortprice"})
	void enterZipp() throws InterruptedException
	{
	Thread.sleep(2000);
	obj.Zip().sendKeys("45362");
	System.out.println("zip code is entered successfully");
	Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
	}
			
	@Test(priority=1,dependsOnMethods= {"enterZipp"})
	void selectdistance()
	{
	Select object = new Select(obj.Distance());
	object.selectByVisibleText("100 miles");
	System.out.println("Distance is selected");
	Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
	}
			
	@Test(priority=1,dependsOnMethods= {"selectdistance"})
	void selectmodel()
	{
		obj.modelselect().click();
		System.out.println("model is selected");
		String model = obj.modelselect().getText();
		System.out.println(model);
		Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
	}
			
	@Test(priority=1,dependsOnMethods= {"selectmodel"})
	void selecttrim() throws InterruptedException 
	{
		Thread.sleep(2000);
		obj.trim().click();
		System.out.println("trim is selected");
		Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
	}
			
	@Test(priority=1,dependsOnMethods= {"selecttrim"})
	void selectepaint() throws InterruptedException
	{
		Thread.sleep(2000);
		obj.epaint().click();
		System.out.println("exterior paint is selected");
		Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
				
	}
			
	@Test(priority=1,dependsOnMethods= {"selectepaint"})
	void selectipaint() throws InterruptedException
	{
		Thread.sleep(2000);
		obj.ipaint().click();
		Thread.sleep(2000);
		System.out.println("interior paint is selected");
		Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
	}
			
	@Test(priority=1,dependsOnMethods= {"selectipaint"})
	void selectsteering() 
	{
		obj.stering().click();
		System.out.println("sterring is selected");
		Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
	}
			
  @Test(priority=1,dependsOnMethods= {"selectsteering"})
  void selwheels() throws InterruptedException 
	{
				
		obj.Wheels().click();
		Thread.sleep(2000);
		System.out.println("wheel is selected");
		obj.pilot().click();
		Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
		Thread.sleep(2000);
	}
			
	@Test(priority=1,dependsOnMethods= {"selwheels"})
	void getcarinformation() throws InterruptedException 
	{
		Actions act=new Actions(driver);
		act.moveToElement(obj.mouseover().get(0)).perform();
		Thread.sleep(2000);
		String pag2=driver.getWindowHandle();
		driver.switchTo().window(pag2);
		System.out.println("navigate to car information page after selecting the car");
		Assert.assertEquals(driver.getTitle(), "New & Used Electric Cars | Tesla");
	}
	
	// for demo drive module 
	
	@Test(priority=2)
	void clickdemo()
	{
		obj.menu().click();
		obj.demodrive().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/drive");
	}
	
	@Test(priority=2,dependsOnMethods= {"clickdemo"})
	void getdtext()
	{
		String text = obj.dtext().getText();
		String text2 = "Schedule a Demo Drive";
		Assert.assertEquals(text2, text, "equal");
	}
	
	@Test(priority=2,dependsOnMethods= {"getdtext"})
	void selectdmodel() 
	{
		obj.modelsel().click();
	    System.out.println("model is selected successfully ");
	    Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/drive?selectedModel=ModelX");
	}
	
	@Test(priority=2,dependsOnMethods= {"selectdmodel"})
	void getinformation() throws InterruptedException
	{
	obj.fname().sendKeys("Sakshi");	
	Thread.sleep(2000);
	obj.lname().sendKeys("Choube");
	Thread.sleep(2000);
	obj.dphone().click();
	Thread.sleep(2000);
	obj.country().click();
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/drive?selectedModel=ModelX");
	}
	
	@Test(priority=2,dependsOnMethods= {"getinformation"})
	void getotherinform() throws InterruptedException
	{
		obj.phone().sendKeys("7696244419");
		obj.emaill().sendKeys("choubeysakshi3@gmail.com");
		Thread.sleep(2000);
		obj.zipcode().sendKeys("56433");
	    obj.agree().click();
		obj.submit().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/drive?selectedModel=ModelX");
	}
	
	@Test(priority=2,dependsOnMethods= {"getotherinform"})
	void clicknextinfo() throws InterruptedException
	{
		Thread.sleep(2000);
		Select object = new Select(obj.locationn());
		object.selectByValue("13756");
		System.out.println("location is selected");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/drive?selectedModel=ModelX");
	}
	
	@Test(priority=2,dependsOnMethods= {"clicknextinfo"})
	void clickdinfo() throws InterruptedException
	{
		Thread.sleep(2000);
		obj.date().click();
		Thread.sleep(2000);
		obj.dclick().click();
		System.out.println("date is selected");	
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/drive?selectedModel=ModelX");
	}
	
	@Test(priority=2,dependsOnMethods= {"clickdinfo"})
	void clicktinfo()
	{
		Select object = new Select(obj.time());
		object.selectByVisibleText("4:30pm");
		System.out.println("time is selected");	
		obj.sub().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/drive?selectedModel=ModelX");
	}
	
	@Test(priority=2,dependsOnMethods= {"clicktinfo"})
	void addimage() throws InterruptedException
	{
		obj.addimg1().sendKeys("C:\\Users\\skumari\\Desktop\\journey-quotes-22.jpg");
		Thread.sleep(2000);
		obj.addimg2().sendKeys("C:\\Users\\skumari\\Desktop\\bug-life-cycle.png");
		Thread.sleep(6000);
		obj.agree2().click();
		obj.sub2().click();
		Thread.sleep(3000);
		String text = obj.notification().getText();
		System.out.println("demo drive confirmation notification : "+text);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/drive?selectedModel=ModelX");

    }
	
    // for utilities functionality 
	
	@Test(priority=3)
	void clickutilities() throws InterruptedException
	{
		obj.menu().click();
		System.out.println("navigate to next page after clicking menu button");
		obj.Utilities().click();
		System.out.println("navigate to next page after clicking Utilities button");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/utilities");
		Thread.sleep(2000);
	}
	
	@Test(priority=3,dependsOnMethods= {"clickutilities"})
	void verifyutilitytext()
	{
		String text = obj.Utext().getText();
		System.out.println(text);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/utilities");
	}
	
	@Test(priority=3,dependsOnMethods= {"verifyutilitytext"})
	void utilityinformation()
	{
		String info = obj.Uinfo().getText();
		System.out.println(info);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/utilities");
	}
	
	@Test(priority=3,dependsOnMethods= {"utilityinformation"})
	void clicklearnmore() throws InterruptedException
	{
		obj.Learnmore().click();
		Thread.sleep(2000);
		System.out.println("navigate to next page after clicking Learnmore button");
		String text= obj.Learntext().getText();
		System.out.println(text);
		String text2 = "Megapack";
		Assert.assertEquals(text, text2);
	}
	
	@Test(priority=3,dependsOnMethods= {"clicklearnmore"})
	void getlinformation()
	{
		String text = obj.Learninfo().getText();
		System.out.println(text);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/megapack");
	}
	
	@Test(priority=3,dependsOnMethods= {"getlinformation"})
	void clickcontactus() throws InterruptedException
	{
	obj.Contactus().click();
	Thread.sleep(2000);
	System.out.println("Contact us page is opened");
	String text = obj.Contactustext().getText();
	System.out.println(text);
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/callback");
	}
	
	@Test(priority=3,dependsOnMethods= {"clickcontactus"})
	void addinformation() throws InterruptedException
	{
		obj.utname().sendKeys("Sakshi");
		Thread.sleep(2000);
		System.out.println("First name is enterted successfully");
		obj.Utlastname().sendKeys("Choube");
		Thread.sleep(2000);
		System.out.println("Last name is enterted successfully");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/callback");
	}
	
	@Test(priority=3,dependsOnMethods= {"addinformation"})
	void selectemail() throws InterruptedException
	{
		Select sel = new Select(obj.Selectemail());
		sel.selectByVisibleText("Email");
		Thread.sleep(2000);
		System.out.println("email is selected");
		obj.Emailll().sendKeys("sakshi34@gmail.com");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/callback");
	}
	
	@Test(priority=3,dependsOnMethods= {"selectemail"})
	void selectphonenumber() throws InterruptedException
	{
		obj.dropdown().click();
		Thread.sleep(2000);
		obj.Countryy().click();
		Thread.sleep(2000);
		obj.Phonenum().sendKeys("7696244419");
		System.out.println("phone number is selected");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/callback");
	}
	
	@Test(priority=3,dependsOnMethods= {"selectphonenumber"})
	void selectregionn() throws InterruptedException
	{
	Select sel = new Select(obj.Region());
	sel.selectByValue("IN");
	Thread.sleep(2000);
	System.out.println("country is selected");
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/callback");
	}
	
	@Test(priority=3,dependsOnMethods= {"selectregionn"})
	void enterzipcode() throws InterruptedException
	{
		obj.ZipCode().sendKeys("567578");
		Thread.sleep(2000);
		obj.Discription().sendKeys("Anytime");
		System.out.println("Discription is filled successfully");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/callback");
	}
	
	@Test(priority=3,dependsOnMethods= {"enterzipcode"})
	void selectpi() throws InterruptedException
	{
		obj.Productinterest().click();
		System.out.println("product is selected");
		obj.Finalsubmit().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/callback");
	}
	
	@Test(priority=3,dependsOnMethods= {"selectpi"})
	void getnotificationn()
	{
		String notify = obj.Notify().getText();
		System.out.println(notify);
		Assert.assertEquals(driver.getTitle(), "Callback | Tesla");
	}
	
	// for Find us functionality
	
			@Test(priority=4)
			void clickfindus()
			{
				obj.menu().click();
				obj.Findus().click();
				System.out.println("navigate to next page after clicking on Find Us button");
				String title = driver.getTitle();
				Assert.assertEquals(title, "Find Us | Tesla");
			}
			
			@Test(priority=4,dependsOnMethods= {"clickfindus"})
			void getfindustext()
			{
				String text = obj.Findtext().getText();
				System.out.println(text);
				Assert.assertEquals(driver.getTitle(), "Find Us | Tesla");
			}
			
			@Test(priority=4,dependsOnMethods= {"getfindustext"})
			void enterlocationn() throws InterruptedException
			{
				WebElement Location = obj.Enterlocation();
				Actions ac = new Actions(driver);
				ac.moveToElement(Location)
				.click()
				.sendKeys(Location, "India")
				.sendKeys(Location, Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.perform();
				Thread.sleep(2000);
				Assert.assertEquals(driver.getTitle(), "Find Us | Tesla");
			}
			
			@Test(priority=4,dependsOnMethods= {"enterlocationn"})
			void clickzoominn() throws InterruptedException
			{
				obj.Zoomin().click();
				Thread.sleep(2000);
				obj.Zoomin().click();
				Assert.assertEquals(driver.getTitle(), "Find Us | Tesla");
			}
			
			@Test(priority=4,dependsOnMethods= {"clickzoominn"})
			void clickzoomout() throws InterruptedException
			{
				Thread.sleep(2000);
				obj.Zommout().click();
				Thread.sleep(2000);
				obj.Zommout().click();
				Assert.assertEquals(driver.getTitle(), "Find Us | Tesla");
			}
	
	@AfterClass
	void closure()
	{
	obj.close();	
	}
}
