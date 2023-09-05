package utils;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.WebTestBase;

public class Utility extends WebTestBase{

	public static void mouseHover(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(1));
	}

	public static void selectValue(WebElement Element, String term, String value) {
		// TODO Auto-generated method stub
		Select dropDown = new Select(Element);
		if(term.equalsIgnoreCase("byValue")) //ignore letter cases 
		{
            dropDown.selectByValue(value);
            
        }else if(term.equalsIgnoreCase("byIndex"))
        {
            dropDown.selectByIndex(Integer.parseInt(value));
            
        }else if(term.equalsIgnoreCase("byVisibleText"))
        {
            dropDown.selectByVisibleText(value);
            
        }else
        {
            System.out.println("Please select the correct value");
        }
	}

	public static void openProductDetails(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void mouseHover1(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
	}



	public static void scrolldown(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void mouseHovering2(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
	}

	public static void radioButton1(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		boolean selectState = element.isSelected();
				
		//performing click operation only if element is not selected
		if(selectState == false) {
			element.click();
	}


	}


	public static void scrollDownByElement(WebDriver driver, WebElement youtubeOption) {
		// TODO Auto-generated method stub
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", youtubeOption);
	}

	public static void switchToWindows(WebDriver driver) {
		// TODO Auto-generated method stub
		String parentWindows = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
        	
            if (!parentWindows.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
           
        }
        driver.switchTo().window(parentWindows);
	}

	public static void openGooglePage(WebDriver driver, WebElement openGoogle) {
		// TODO Auto-generated method stub
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", openGoogle);
	
	}

}
