package tesla_pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tesla_objectpage extends Tesla_basepage
{
@FindBy(xpath="//a[@class='tds-site-logo-link']")
WebElement logo;

@FindBy(xpath="//div[@class='layout layout--onecol']")
WebElement bimage;

@FindBy(xpath="//div[@class='tds--hideon-phone-only']")
WebElement text ;

//Xpath for navbar buttons 

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Model S']")
WebElement models ;

@FindBy(xpath="//div[@class='tcl-hero__content-end tds-animate_small--reveal']/section")
WebElement modelsinfo ;

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Model 3']")
WebElement model3 ;

@FindBy(xpath="//div[@class='tds--hideon-phone-only']")
WebElement model3text ;

@FindBy(xpath="//div[@class='tcl-hero__content-end']/section")
WebElement model3info ;

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Model X']")
WebElement modelX ;

@FindBy(xpath="//div[@class='tcl-hero__content-end tds-animate_small--reveal']/section")
WebElement modelXinfo ;

@FindBy(xpath="//h2[@class='text-align-center']")
WebElement centretext ;

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Model Y']")
WebElement modelY ;

@FindBy(xpath="//div[@class='tds--hideon-phone-only']")
WebElement gettext;

@FindBy(xpath="//div[@class='tcl-hero__content-end tds-animate_small--reveal']/section")
WebElement modelyinfo;

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Solar Roof']")
WebElement Solarroof ;

@FindBy(xpath="//h1[@class='tcl-hero__heading tds-colorscheme--dark']")
WebElement SolarRtext;

@FindBy(xpath="//div[@class='tcl-hero__content-end']/section")
WebElement SolarRinfo;

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Solar Panels']")
WebElement Solarpanel ;

@FindBy(xpath="//span[@class='tds-text--h2 tcl-order__header']")
WebElement SolarPtext;

@FindBy(xpath="//div[@class='tcl-hero__content-end']/section")
WebElement SolarPinfo;

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Powerwall']")
WebElement power ;

@FindBy(xpath="//h1[@class='tcl-hero__heading tds-colorscheme--dark']")
WebElement Ptext;

@FindBy(xpath="//div[@class='tcl-hero__content-end']/section")
WebElement Pinfo;

// menu module xpath

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Menu']")
WebElement menu;

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Existing Inventory']")
WebElement menuitem1;

@FindBy(xpath="//h1[@class='inventory-app-title']")
WebElement heading1;

@FindBy(xpath="//select[@id='filter_lbl']")
WebElement sort;

@FindBy(xpath="//input[@placeholder='Enter Zip']")
WebElement Zip;

@FindBy(xpath="//select[@id='search-radius-dropdown']")
WebElement Distance;

@FindBy(xpath="//input[@name='Models'][@title='Model S']")
WebElement Modelselect;

@FindBy(xpath="//input[@name='Inventory Type'][@title='New']")
WebElement type;

@FindBy(xpath="//label[@class='tds-form-label' and text()='Model S Plaid']")
WebElement trim;

@FindBy(xpath="//span[@class='tds-label-title tds--is_visually_hidden' and text()='Blue']/parent::label")
WebElement epaint;

@FindBy(xpath="//label[@for='checkbox-INTERIOR_BLACK']")
WebElement ipaint;

@FindBy(xpath="//span[@class='tds-label-title tds--is_visually_hidden' and text()='Steering Wheel']/parent::label")
WebElement sterring;

@FindBy(xpath="//input[@class='tds-form-input-choice tds-o-outline'][@name='NINETEEN']")
WebElement Wheels;

@FindBy(xpath="//input[@id='AUTOPILOT:AUTOPILOT']")
WebElement pilot;

@FindBy(xpath="//button[@data-id='view-details-button' and text()='View Details']")
List<WebElement> Carinformation;

@FindBy(xpath="//article[@class='result card']")
List<WebElement> mouseover;


@FindBy(xpath="//div[@class='group-container']//div[@class='aside-section side-scroll--item']")
List<WebElement> Cartextinfo;


//Xpath For demo drive
@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Demo Drive']")
WebElement demodrive;

@FindBy(xpath="//h1[text()='Schedule a Demo Drive']")
WebElement dtext;

@FindBy(xpath="//div[@class='btn-container']/child::button[text()='Model X']")
WebElement modelsel;

@FindBy(xpath="//input[@id='edit-firstname-td']")
WebElement fname;

@FindBy(xpath="//input[@id='edit-lastname-td']")
WebElement lname;

@FindBy(xpath="//div[@class='tds-tooltip-wrapper tds-tooltip-wrapper--inline']")
WebElement dphone;

@FindBy(xpath="//span[@class='tds-country-code' and text()='IN']/parent::span")
WebElement country;

@FindBy(xpath="//input[@id='edit-phonenumber-td']")
WebElement phone;

@FindBy(xpath="//input[@id='edit-usermail-td']")
WebElement emaill ;

@FindBy(xpath="//input[@id='edit-zipcode-td']")
WebElement zipcode;

@FindBy(xpath="//input[@id='interest-solar-powerwall'][@name='einterest']")
WebElement agree ;

@FindBy(xpath="//button[@class='tds-btn' and text()='Submit and Continue']")
WebElement submit ;

@FindBy(xpath="//select[@id='select-location']")
WebElement locationn;

@FindBy(xpath="//input[@id='select-day']")
WebElement date;

@FindBy(xpath="//button[@class='tds-day']/child::span[text()='22']")
WebElement dclick;

@FindBy(xpath="//select[@id='select-time']")
WebElement time;

@FindBy(xpath="//button[@id='edit-submit-td-ajax-3']")
WebElement sub;

//Xpath for Demo Drive agreement 

@FindBy(xpath="(//input[@class='file-upload'])[1]")
WebElement addimg1;

@FindBy(xpath="(//input[@class='file-upload'])[2]")
WebElement addimg2;

@FindBy(xpath="//input[@id='acceptTerms']")
WebElement agree2;

@FindBy(xpath="//button[@data-section='driverlicenseSection']")
WebElement sub2;

@FindBy(xpath="//div[@class='notification-section']")
WebElement notify ;

//Xpath for add to cart functionality

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Charging']")
WebElement charging ;

@FindBy(xpath="//h1[@class='tcl-hero__heading tds-colorscheme--light tds-animate_small--to_reveal']")
WebElement charge ;

@FindBy(xpath="//section[@class='tcl-badges tcl-badges--with-animation tds-colorscheme--light tcl-badges--three-badges']")
WebElement carinfo ;

@FindBy(xpath="//span[@class='tcl-animate tcl-animate--to-reveal tcl-animate--revealed' and text()='Home Charging']")
WebElement hometext ;

@FindBy(xpath="(//a[@data-button-text-desktop='Shop Now']/span)[3]")
WebElement shopnow ;

@FindBy(xpath="//span[@class='item-without-content tds-text--body']")
WebElement shop ;

@FindBy(xpath="(//input[@data-item-update='Update'])[1]")
WebElement item ;

@FindBy(xpath="//h5[@class='product-tile__title' and text()='Mobile Connector']")
WebElement item2 ;

@FindBy(xpath="(//input[@data-item-update='Update'])[1]")
WebElement item2add ;

@FindBy(xpath="//h5[@class='product-tile__title' and text()='Cable Organizer']")
WebElement item3 ;

@FindBy(xpath="(//button[@class='quantity-picker-button'])[2]")
WebElement quantity ;

@FindBy(xpath="(//input[@data-item-update='Update'])[1]")
WebElement item3add ;

@FindBy(xpath="//div[@class='item-without-content nav-cart']")
WebElement gocart ;

@FindBy(xpath="//div[@class='order-summary__container']")
WebElement order ;

@FindBy(xpath="(//div[@class='lineitem__main-info'])[1]")
WebElement item1info ;

@FindBy(xpath="(//div[@class='lineitem__main-info'])[2]")
WebElement item2info ;

@FindBy(xpath="(//div[@class='lineitem__main-info'])[3]")
WebElement item3info ;

@FindBy(xpath="(//button[@aria-haspopup='listbox'])[1]")
WebElement item1quantity ;

@FindBy(xpath="(//li[@class='tds-listbox-option'])[1]")
WebElement quantitysel1;

@FindBy(xpath="//button[@class='tds-btn tds-btn--primary']")
WebElement checkout ;

@FindBy(xpath="//a[@class='tds-btn tds-btn--secondary tds-btn--width-full']")
WebElement guest ;

@FindBy(xpath="//h1[@class='checkout-title with-steps-title']")
WebElement guesttext ;

@FindBy(xpath="(//input[@class='tds-form-input-text'])[1]")
WebElement Firstname ;

@FindBy(xpath="(//input[@class='tds-form-input-text'])[2]")
WebElement Lastname ;

@FindBy(xpath="(//input[@class='tds-form-input-text'])[3]")
WebElement Emaill ;

@FindBy(xpath="(//button[@class='tds-btn tds-btn--primary checkout__btn'])")
WebElement Nextclick ;

//Xpath for utilities module

@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Utilities']")
WebElement Utilities ;

@FindBy(xpath="//h1[@class='tcl-hero__heading tds-colorscheme--dark']")
WebElement Utext ;

@FindBy(xpath="//section[@class='tcl-badges tds-colorscheme--dark tcl-badges--three-badges-with-button']")
WebElement Uinfo ;

@FindBy(xpath="(//div[@class='tcl-section-header-group__buttons '])[1]/child::section/a[1]")
WebElement Learnmore ;

@FindBy(xpath="//h1[@class='tcl-hero__heading']")
WebElement Learntext ;

@FindBy(xpath="//section[@class='tcl-badges tds-colorscheme--light tcl-badges--three-badges-with-button']")
WebElement Learninfo ;

@FindBy(xpath="//span[text()='Contact Us']")
WebElement Contactus ;

@FindBy(xpath="//h2[@class='text-align-center']")
WebElement Contactustext ;

@FindBy(xpath="//input[@name='firstName']")
WebElement utname ;

@FindBy(xpath="//input[@name='lastName']")
WebElement Utlastname ;

@FindBy(xpath="//select[@name='contactPreference']")
WebElement Selectemail ;

@FindBy(xpath="//input[@name='email']")
WebElement Emailll ;

@FindBy(xpath="//span[@class='tds-country-code' and text()='IN']/parent::span")
WebElement countryy;

@FindBy(xpath="//button[@class='tds-dropdown-trigger']")
WebElement dropdown ;

@FindBy(xpath="//input[@name='phone']")
WebElement Phonenum ;

@FindBy(xpath="//select[@name='country']")
WebElement Region ;

@FindBy(xpath="//input[@name='zip']")
WebElement ZipCode ;

@FindBy(xpath="//textarea[@name='notesWhenDoWeCall']")
WebElement Discription ;

@FindBy(xpath="(//input[@name='productInterested'])[5]")
WebElement Productinterest ;

@FindBy(xpath="//button[@class='tds-btn tds-btn--primary tcl-button']")
WebElement Finalsubmit ;

@FindBy(xpath="//div[@class='layout-content']")
WebElement Notification ;

// for Find Us functionality 
@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Find Us']")
WebElement FindUs ;

@FindBy(xpath="//div[@class='tds-banner tds-scrim--light']")
WebElement FindUstext ;

@FindBy(xpath="//input[@class='search-input tsla-icon-search']")
WebElement Enterlocation ;

@FindBy(xpath="//button[@title='Zoom in']")
WebElement Zoomin ;

@FindBy(xpath="//button[@title='Zoom out']")
WebElement Zoomout ;


public Tesla_objectpage()
{
	PageFactory.initElements(driver,this);
}

public WebElement logo()
{
	return logo;
}

public WebElement image()
{
	return bimage;
}

public WebElement text_print()
{
	return text;
}
// navbar button methods
public WebElement models_webelement()
{
	return models;
}

public WebElement modelsinfo_webelement()
{
	return modelsinfo;
}

public WebElement model3_webelement()
{
	return model3 ;
}

public WebElement model3text_webelement()
{
	return model3text ;
}

public WebElement model3info_webelement()
{
	return model3info ;
}

public WebElement modelx_webelement()
{
	return modelX ;
}
public WebElement modelxinfo_webelement()
{
	return modelXinfo ;
}

public WebElement ctext_webelement()
{
	return centretext ;
}

public WebElement modely_webelement()
{
	return modelY ;
}

public WebElement gettext_webelement()
{
	return gettext ;
}
public WebElement modelyinfo_webelement()
{
	return modelyinfo ;
}

public WebElement Solarr_webelement()
{
	return Solarroof ;
}

public WebElement solartext_webelement()
{
	return SolarRtext ;
}
public WebElement Solarinfo_webelement()
{
	return SolarRinfo ;
}

public WebElement Solarp_webelement()
{
	return Solarpanel ;
}

public WebElement solarptext_webelement()
{
	return SolarPtext ;
}
public WebElement Solarpinfo_webelement()
{
	return SolarPinfo ;
}
public WebElement power_webelement()
{
	return power ;
}

public WebElement ptext_webelement()
{
	return Ptext ;
}
public WebElement pinfo_webelement()
{
	return Pinfo ;
}

// menu module methods
public WebElement menu()
{
	return menu ;
}

public WebElement menuitem1()
{
	return menuitem1 ;
}

public WebElement heading1()
{
	return heading1 ;
}

public WebElement sort()
{
	return sort ;
}
public WebElement Zip()
{
	return Zip ;
}

public WebElement Distance()
{
	return Distance ;
}

public WebElement modelselect()
{
	return Modelselect ;
}
public WebElement type()
{
	return type ;
}

public WebElement trim()
{
	return trim ;
}
public WebElement epaint()
{
	return epaint ;
}

public WebElement ipaint()
{
	return ipaint ;
}

public WebElement stering()
{
	return sterring ;
}

public WebElement Wheels()
{
	return Wheels ;
}
public WebElement pilot()
{
	return pilot ;
}
public List<WebElement> Carinformation()
{
	return Carinformation ;
}
public List<WebElement> mouseover()
{
	return mouseover ;
}
public List<WebElement> Cartext()
{
	return Cartextinfo ;
}


//demo drive methods
public WebElement demodrive()
{
	return demodrive ;
}

public WebElement dtext()
{
	return dtext ;
}
public WebElement modelsel()
{
	return modelsel ;
}
public WebElement fname()
{
	return fname ;
}
public WebElement lname()
{
	return lname ;
}
public WebElement dphone()
{
	return dphone ;
}
public WebElement country()
{
	return country ;
}
public WebElement phone()
{
	return phone ;
}
public WebElement emaill()
{
	return emaill ;
}
public WebElement zipcode()
{
	return zipcode ;
}
public WebElement agree()
{
	return agree ;
}
public WebElement submit()
{
	return submit ;
}
public WebElement locationn()
{
	return locationn ;
}
public WebElement date()
{
	return date ;
}
public WebElement dclick()
{
	return dclick ;
}
public WebElement time()
{
	return time ;
}
public WebElement sub()
{
	return sub ;
}
public WebElement addimg1()
{
	return addimg1 ;
}
public WebElement addimg2()
{
	return addimg2 ;
}

public WebElement agree2()
{
	return agree2 ;
}

public WebElement sub2()
{
	return sub2 ;
}
public WebElement notification()
{
	return notify ;
}
// add to cart methods
public WebElement charging()
{
	return charging ;
}
public WebElement charge()
{
	return charge ;
}
public WebElement carinfo()
{
	return carinfo ;
}
public WebElement hometext()
{
	return hometext ;
}
public WebElement shopnow()
{
	return shopnow ;
}
public WebElement shop()
{
	return shop ;
}
public WebElement item()
{
	return item ;
}
public WebElement item2()
{
	return item2 ;
}
public WebElement item2add()
{
	return item2add ;
}
public WebElement item3()
{
	return item3 ;
}
public WebElement quantity()
{
	return quantity ;
}
public WebElement item3add()
{
	return item3add ;
}
public WebElement gocart()
{
	return gocart ;
}
public WebElement order()
{
	return order ;
}
public WebElement item1info()
{
	return item1info ;
}
public WebElement item2info()
{
	return item2info ;
}
public WebElement item3info()
{
	return item3info ;
}
public WebElement item1quantity()
{
	return item1quantity ;
}
public WebElement item1sel()
{
	return quantitysel1 ;
}
public WebElement checkout()
{
	return checkout ;
}
public WebElement Guest()
{
	return guest ;
}
public WebElement Guesttext()
{
	return guesttext ;
}
public WebElement Firstname()
{
	return Firstname ;
}
public WebElement Lastname()
{
	return Lastname ;
}
public WebElement Emaill()
{
	return Emaill ;
}
public WebElement Nextclick()
{
	return Nextclick ;
}

// Utilities functionality methods 
public WebElement Utilities()
{
	return Utilities ;
}
public WebElement Utext()
{
	return Utext ;
}
public WebElement Uinfo()
{
	return Uinfo ;
}
    public WebElement Learnmore()
{
    	return Learnmore  ;
}
public WebElement Learntext()
{
	return Learntext ;
}
public WebElement Learninfo()
{
	return Learninfo ;
}
public WebElement Contactus()
{
		return Contactus ;
}
public WebElement Contactustext()
{
		return Contactustext ;
}
public WebElement utname()
{
		return utname ;
}
public WebElement Utlastname()
{
		return Utlastname ;
}
public WebElement Selectemail()
{
		return Selectemail ;
}
public WebElement Emailll()
{
		return Emailll ;
}
public WebElement dropdown()
{
		return dropdown ;
}
public WebElement Countryy()
{
		return countryy ;
}
public WebElement Phonenum()
{
		return Phonenum ;
}
public WebElement Region()
{
		return Region ;
}
public WebElement ZipCode()
{
		return ZipCode ;
}
public WebElement Discription()
{
	return Discription ;
}
public WebElement Productinterest()
{
	return Productinterest ;
}
public WebElement Finalsubmit()
{
	return Finalsubmit ;
}
public WebElement Notify()
{
	return Notification ;
}

// methods for Find Us
public WebElement Findus()
{
	return FindUs ;
}
public WebElement Findtext()
{
	return FindUstext ;
}
public WebElement Enterlocation()
{
	return Enterlocation ;
}
public WebElement Zoomin()
{
	return Zoomin ;
}
public WebElement Zommout()
{
	return Zoomout ;
}
}
