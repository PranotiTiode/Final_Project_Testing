package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WebTestBase;

public class LoginPage extends WebTestBase{

	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement userPassword;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void loginAcc() {
		// TODO Auto-generated method stub
		userName.click();
		userName.sendKeys("pabc965@gmail.com");
		
		userPassword.click();
		userPassword.sendKeys("Aaaa1234$&1421");
		
		login.click();
	}

	
}
