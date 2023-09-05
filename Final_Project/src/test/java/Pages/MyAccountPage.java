package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WebTestBase;

public class MyAccountPage extends WebTestBase{

	@FindBy(xpath = "//a[text()='My Account']")
    WebElement accountTitle;
	
	@FindBy(xpath="//input[@id='reg_email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='reg_password']")
	WebElement setPassword;
	
	@FindBy(xpath="//input[@name='register']")
	WebElement register;
	
	public MyAccountPage(){
		PageFactory.initElements(driver,this);
    }

	public void openMyAccount() {
		// TODO Auto-generated method stub
		accountTitle.click(); 	
	}
	
	public String getTextOFMYAccountPage() {
		// TODO Auto-generated method stub
		return accountTitle.getText();
	}

	public void registerAcc() {
		// TODO Auto-generated method stub
		emailAddress.click();
		emailAddress.sendKeys("reena123@gmail.com");
		
		setPassword.click();
		setPassword.sendKeys("Aaaa1234$&1421");
		
		register.click();
	}


	
	
}
