package TestCase;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.ProductShopPage;
import TestBase.WebTestBase;


public class TestCase1 extends WebTestBase {

	MyAccountPage myAccountPage; 
	HomePage homePage;
	LoginPage loginPage;
	ProductShopPage shopProduct;
	
	public TestCase1() 
	{
		super();
	}
	
	
	@BeforeMethod 
	public void BeforeMethod()
	{
		
		initialization(); 
		
		homePage= new HomePage();
		loginPage= new LoginPage();
		myAccountPage = new MyAccountPage();
		shopProduct = new ProductShopPage();
		
		
	}
	
	@Test (priority=1)//,enabled=false
	public void consolePrint()
	{
		System.out.println("This is Automation Testing Project");
	}
	
	@Test(priority=2)
	public void homepageCredentials()
	{ 
		homePage.userSearchClick(); 
		
		SoftAssert softAssert = new SoftAssert();
		myAccountPage.openMyAccount();
		softAssert.assertEquals(myAccountPage.getTextOFMYAccountPage(), "My Account", "My Account text should not be match"); 
	    System.out.println("My Account text should be match");
	    
	    softAssert.assertAll(); 
	}
	
	@Test(priority=3)
	 public void verifyGetWindowHandle() throws Exception{
	     SoftAssert softAssert = new SoftAssert();
	     homePage.windowHandle();
	     softAssert.assertAll();
	     
	 }
	
	@Test(priority=4,enabled=true)
	public void searchBar()
	{
		SoftAssert softAssert = new SoftAssert();
		
		homePage.mouseHover();
		homePage.searchBook();
		System.out.println(homePage.getTextOfSearch());
	     softAssert.assertEquals(homePage.getTextOfSearch(), "Showing results for \"Mastering JavaScript\"\n" +
	             "263 results found","Showing results for \"Mastering JavaScript\"\n" +
	             "263 results found text should be match"); 
		
	}
	
	@Test(priority=5)
	public void mouseHovers()
	{
		SoftAssert softAssert = new SoftAssert();
		homePage.mouseHovering();
	     softAssert.assertAll();
	}
	
	@Test(priority=6)//enabled=false
	public void registerMyAccount()
	{
		myAccountPage.openMyAccount();
		myAccountPage.registerAcc();
	}
	
	@Test(priority=7)
	public void loginMyAccount()
	{
		myAccountPage.openMyAccount();
		loginPage.loginAcc();
	}
	
	@Test(priority=8)
	public void scrollDownMethod()
	{
		SoftAssert softAssert = new SoftAssert();
		homePage.bookShop();
	    softAssert.assertAll();
	}
	
	@Test(priority=9)
	public void dropDownSelection()
	{
		shopProduct.bookShop();
		
		shopProduct.selectDropDown("byVisibleText", "Sort by popularity");		
		shopProduct.selectCategory();
	}
	
	@Test(priority=10)
	public void removeCartProduct()
	{
		shopProduct.bookShop();
		shopProduct.selectBook();
	}
	
	@Test(priority=11)//,enabled=true
	public void purchaseProduct()
	{
		myAccountPage.openMyAccount();
		loginPage.loginAcc();
		shopProduct.bookShop();
		shopProduct.bookshopping();
	}
	
	@Test(priority=12)
	public void testBStackTakeScreenShot() throws Exception{
		TestCase1.takeSnapShot(driver, "C://Users//shash//.eclipse//Final_Project//src//main//resources//Taking Screenshot//test1.png") ; 
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);

		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	
}
