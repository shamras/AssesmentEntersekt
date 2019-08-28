package QEtodolist.TestingQEtodolist;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.MainPage;
import Utilities.DriverFactory;

public class Test_todolistFunctions {

	 @Test
	    public void loginTestPom() throws InterruptedException {
	        ///Initialize diver
		
	        WebDriver driver = DriverFactory.open("chrome");///note this can be changed to Firefox or IE to test different browsers, ensure you remove the comments from the IE data in the utilities package
	        driver.get("http://localhost:8080/todo");

	        ///create item
	        MainPage mainPage = new MainPage(driver);
	        mainPage.create_items();
	        

	        ///delete item/////
	        mainPage.delete_items();
	        mainPage.update_items();
	   

	        ////edit item////
	     

	    }}






