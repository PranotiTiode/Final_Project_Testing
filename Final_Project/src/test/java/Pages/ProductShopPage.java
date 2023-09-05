package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WebTestBase;
import utils.Utility;


public class ProductShopPage extends WebTestBase {
	
	@FindBy(xpath="//a[text()='Shop']")
	WebElement shopPage;   
	
	@FindBy(xpath="//select[@name='orderby']")
	WebElement dropDown;
	
	@FindBy(xpath="//a[text()='Android']")
	WebElement category;

	
	@FindBy(xpath= "//img[@title='Android Quick Start Guide']")
	WebElement openProduct;
	
	@FindBy(xpath="//input[@title='Qty']")
	WebElement numberofQuantity;
	
	@FindBy(xpath="//button[text()='Add to basket']")
	WebElement addToCart;
	
	@FindBy(xpath="//a[@class='button wc-forward']")
	WebElement viewCart;
	
	@FindBy(xpath="//a[@class='remove']")
	WebElement removeFromCart;
	
	@FindBy(xpath="//a[@class='button wc-backward']")
	WebElement continueShopping;
	
	@FindBy(xpath="//li[@id='wpmenucartli']")
	WebElement gotoCart;
	
	
	@FindBy(xpath="//a[@class='checkout-button button alt wc-forward']")
	WebElement proceed;
	
	@FindBy(id="order_comments")
	WebElement comment;

	
//	****************************************Enter Address Details***************************************************	
	@FindBy(id="billing_first_name")
	WebElement firstName;     
							  
	
	@FindBy(id="billing_last_name")
	WebElement lastName;
	
	@FindBy(id="billing_company")
	WebElement company;
	
	@FindBy(id="billing_email")
	WebElement email;
	
	@FindBy(id="billing_phone")
	WebElement phone;
	
	@FindBy(xpath="//span[@id='select2-chosen-1']")
	WebElement countryClick;
	
	@FindBy(xpath="//input[@id='s2id_autogen1_search']")
	WebElement countryName;

	@FindBy(xpath="//input[@id='billing_address_1']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='billing_city']")
	WebElement townCity;
	
	@FindBy(xpath="//input[@id='billing_state']")
	WebElement state;
	
	@FindBy(id="billing_postcode")
	WebElement zipCode;
	
	@FindBy(id="createaccount")
	WebElement createAccount;	
	
	@FindBy(id="account_password")
	WebElement pass;
	
	@FindBy(id="payment_method_cod")//label[@for='payment_method_cod']
	WebElement COD;
	
	@FindBy(id="place_order")
	WebElement PO;
	
	
	
//	*******************************************************************************************
	
	public ProductShopPage(){
		PageFactory.initElements(driver,this);
	}

	public void bookShop() {
		// TODO Auto-generated method stub
		shopPage.click();
	}

	public void selectDropDown(String term, String value) {
		// TODO Auto-generated method stub
		dropDown.click();
		Utility.selectValue(dropDown,term,value);
	}

	public void selectCategory() {
		// TODO Auto-generated method stub
		category.click();
	}



	public void selectBook() {
		// TODO Auto-generated method stub
		openProduct.click();
	numberofQuantity.clear();
	numberofQuantity.sendKeys("2");
	addToCart.click();
	viewCart.click();
	removeFromCart.click();
	continueShopping.click();
	}

	public void bookshopping() {
		
		openProduct.click();
		numberofQuantity.clear();
		numberofQuantity.sendKeys("2");
		addToCart.click();
	
		gotoCart.click();
		proceed.click();
		
//						firstName.sendKeys("AAA");
//						lastName.sendKeys("BBB");
//						company.sendKeys("Xyz");
//						email.sendKeys("reena12@gmail.com");
//						phone.sendKeys("8856214359");
//		  
//		
//						countryClick.click();
//						countryName.sendKeys("India");
//						countryName.sendKeys(Keys.ENTER);
//		
//						address.sendKeys("jk chaok, 1st building, R.No.301, 3rd floor");
//						townCity.sendKeys("Jalana");
//						state.sendKeys("Maharashtra");
//	
//						zipCode.sendKeys("123456");
//						createAccount.click();
//						pass.sendKeys("Admin$1234");
						
		comment.sendKeys("Do not ring Bell. call on phone...");
		Utility.scrolldown(driver,COD);
		COD.click();
			PO.click();
	}

	

}
