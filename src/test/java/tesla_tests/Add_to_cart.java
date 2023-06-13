package tesla_tests;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.*;
import tesla_pages.Tesla_objectpage;

public class Add_to_cart extends Tesla_objectpage
{
Tesla_objectpage obj;
	
	@BeforeClass
	public void launch() throws IOException
	{
		Homepage();
		obj = new Tesla_homepagetest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	// for add to cart functinality 
	
		@Test(priority=1)
		void getText()
		{
			obj.menu().click();
			obj.charging().click();
			System.out.println("charging menu is selected");
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.tesla.com/charging");
		}
		
		@Test(priority=2)
		void  getChargetext()
		{
			String charge = obj.charge().getText();
			System.out.println(charge); 
			String text2 = "Stay Charged";
			Assert.assertEquals(charge, text2);
		}
		
		@Test(priority=3)
		void getCarinfo()
		{
		String carinfo = obj.carinfo().getText();	
		System.out.println("car information is : "+carinfo);
		Assert.assertEquals(driver.getTitle(), "Charging | Tesla");
		
		}
		
		@Test(priority=4)
		void clickShopnow() throws InterruptedException
		{
			obj.shopnow().click();
			System.out.println("shop now option is selected ");
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "Wall Connector");
		}
		
		@Test(priority=5)
		void addItem() throws InterruptedException
		{
			obj.item().click();
			Thread.sleep(2000);
			System.out.println("item is selected to cart");
			Thread.sleep(6000);
			Assert.assertEquals(driver.getTitle(), "Wall Connector");
		}
		
		@Test(priority=6)
		void addItem1() throws InterruptedException
		{
			obj.item2().click();
			Thread.sleep(3000);
			System.out.println("navigate to next page after selecting element ");
			obj.item2add().click();
			System.out.println("Item2 is selected successfully");
			Thread.sleep(6000);
			Assert.assertEquals(driver.getTitle(), "Mobile Connector");
		}
		
		@Test(priority=7)
		void addItem2() throws InterruptedException
		{
			driver.navigate().back();
			obj.item3().click();
			System.out.println("navigate to next page after selecting element ");
			Thread.sleep(2000);
			obj.quantity().click();
			Thread.sleep(2000);
	        obj.item3add().click();
	        System.out.println("item3 is selected successfully ");
	        Thread.sleep(6000);
	        Assert.assertEquals(driver.getTitle(), "Cable Organizer");
	        }
		
		@Test(priority=8)
		void clickCartshow()
		{
		obj.gocart().click();
		System.out.println("cart is opened successfully");
		String summary = obj.order().getText();
		System.out.println("order summary is :"+summary);
		Assert.assertEquals(driver.getCurrentUrl(), "https://shop.tesla.com/cart");
		}
		
		@Test(priority=9)
		void getItem1info()
		{
			String item1info = obj.item1info().getText();
			System.out.println("item1 information is displayed :"+item1info);
			Assert.assertEquals(driver.getCurrentUrl(), "https://shop.tesla.com/cart");
			
		}
		
		@Test(priority=10)
		void getItem2info()
		{
			String item2info = obj.item2info().getText();
			System.out.println("item2 information is displayed :"+item2info);
			Assert.assertEquals(driver.getCurrentUrl(), "https://shop.tesla.com/cart");
		}
		
		@Test(priority=11)
		void getItem3info()
		{
			 String item3info = obj.item3info().getText();
			 System.out.println("item3 information is displayed :"+item3info);
			 Assert.assertEquals(driver.getCurrentUrl(), "https://shop.tesla.com/cart");
		}
		
		@Test(priority=12)
		void selectQuantity() throws InterruptedException
		{
			obj.item1quantity().click();
			Thread.sleep(3000);
			obj.item1sel().click();
			System.out.println("more quantity is selected");
			Assert.assertEquals(driver.getCurrentUrl(), "https://shop.tesla.com/cart");
			
		}
		
		@Test(priority=13)
		void clickCheckout() throws InterruptedException
		{
			Thread.sleep(3000);
			obj.checkout().click();
			System.out.println("navigate to next page after clicking on checkout");
			Thread.sleep(3000);
			Assert.assertEquals(driver.getTitle(), "Login | Tesla");
		}
		
		@Test(priority=14)
		void clickGuest() throws InterruptedException
		{
		obj.Guest().click();
		System.out.println("navigate to guest page");
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), "Tesla | Checkout");
		}
		
		@Test(priority=15)
		void verifyGuesttext()
		{
		boolean text =obj.Guesttext().isDisplayed();
		System.out.println(text);
		Assert.assertEquals(driver.getTitle(), "Tesla | Checkout");
		}
		
		@Test(priority=16)
		void getGuestinfo() throws InterruptedException
		{
		obj.Firstname().sendKeys("Sakshi");
		obj.Lastname().sendKeys("Choubey");
		obj.Emaill().sendKeys("choubeysakshi3@gmail.com");
		obj.Nextclick().click();
		System.out.println("navigate to next page ");
		Assert.assertEquals(driver.getTitle(), "Tesla | Checkout");
	}
		
		@AfterClass
		void closure()
		{
		obj.close();	
		}
}
