package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WebTestBase;
import utils.Utility;

public class HomePage extends WebTestBase{

	@FindBy(xpath = "//img[@alt='Shop Selenium Books']")  
    WebElement usersearch;
	
	@FindBy(xpath="//div[@id='searchform-wrap']")
	WebElement hover;
	
	@FindBy(xpath="//input[@id='s']")
	WebElement searchTextBox;
	
	@FindBy(xpath="//a[@title='Mastering JavaScript']")
	WebElement searchTitle;
	
	@FindBy(xpath="//a[text()='0']")
	WebElement clickZero;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement hovering;
	
	@FindBy(xpath="//i[@class='fa fa-youtube']")
	WebElement youtubeOption;
	
	@FindBy(xpath="//a[@class='pull-down']")
	WebElement logo;
	
	
	@FindBy(xpath="//i[@class='fa fa-google-plus']")
	WebElement openGoogle;

    public HomePage(){
    	
        PageFactory.initElements(driver,this); 
    }
    
    public void userSearchClick(){
        usersearch.click(); 
    }

	public void mouseHover() {
		// TODO Auto-generated method stub
		Utility.scrolldown(driver,hover);
		Utility.mouseHover1(driver,hover);
	}

	public void searchBook() {
		// TODO Auto-generated method stub
		searchTextBox.click();
        searchTextBox.sendKeys("Mastering JavaScript");
        searchTextBox.sendKeys(Keys.ENTER);
        clickZero.click();
	}
    
	public String getTextOfSearch() {
		// TODO Auto-generated method stub
		return searchTitle.getText();
	}

	public void mouseHovering() {
		// TODO Auto-generated method stub
		Utility.mouseHovering2(driver,hovering);
	}

	public void windowHandle() throws Exception {
		// TODO Auto-generated method stub
		Utility.scrollDownByElement(driver,youtubeOption);
		youtubeOption.click();
		Thread.sleep(5000);
		Utility.switchToWindows(driver);
	}

	public void bookShop() {
		Utility.openGooglePage(driver,openGoogle);
		openGoogle.click();
	}



    
}
