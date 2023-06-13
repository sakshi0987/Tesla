package tesla_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tesla_login_object extends Tesla_basepage
{
	// logintest xpath

	@FindBy(xpath="//span[@class='tds-site-nav-item-text' and text()='Account']")
	WebElement account ;

	@FindBy(xpath="//button[@id='form-button-create' and text()='Create Account']")
	WebElement Createaccount ;

	@FindBy(xpath="//h1[@class='tds-text--h1-alt tds-text-eyebrow header-width']")
	WebElement Createtext ;

	@FindBy(xpath="//input[@id='form-input-first_name']")
	WebElement Firname ;

	@FindBy(xpath="//input[@id='form-input-last_name']")
	WebElement Lasname ;

	@FindBy(xpath="//input[@id='captcha']")
	WebElement captcha ;

	@FindBy(xpath="//button[@id='form-step1-next']")
	WebElement nextclick ;

	@FindBy(xpath="//input[@class='tds-form-input-text']")
	WebElement email ;

	@FindBy(xpath="(//input[@class='tds-form-input-password'])[1]")
	WebElement pass ;

	@FindBy(xpath="(//div[@class='tds-form-input-trailing'])[1]")
	WebElement showpass ;

	@FindBy(xpath="(//input[@class='tds-form-input-password'])[2]")
	WebElement pass2 ;

	@FindBy(xpath="(//div[@class='tds-form-input-trailing'])[2]")
	WebElement showpass2 ;

	@FindBy(xpath="//button[@id='form-submit']")
	WebElement signin ;

public Tesla_login_object()
{
	PageFactory.initElements(driver,this);
}
//logintest methods
public WebElement account()
{
	return account ;
}
public WebElement Createaccount()
{
	return Createaccount ;
}
public WebElement Createtext()
{
	return Createtext ;
}
public WebElement Firstnam()
{
	return Firname ;
}
public WebElement Lastnam()
{
	return Lasname ;
}
public WebElement Captcha()
{
	return captcha ;
}
public WebElement Next()
{
	return nextclick ;
}
public WebElement Emailenter()
{
	return email ;
}
public WebElement Password()
{
	return pass ;
}
public WebElement Showpass()
{
	return showpass ;
}
public WebElement Password2()
{
	return pass2 ;
}
public WebElement Showpass2()
{
	return showpass2 ;
}
public WebElement Signin()
{
	return signin ;
}

}
