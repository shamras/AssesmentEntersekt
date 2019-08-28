package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	 WebDriver driver;


	    public void create_items() {
	        //String data = driver.findElement(By.linkText("Trending")).getText();
	        //System.out.println("Trending : " + data);
	    	driver.findElement(By.id("newtodo")).sendKeys("create test plan2");
	    	driver.findElement(By.id("new-submit")).click();
	    }

	    public void delete_items() throws InterruptedException {
	        driver.findElement(By.xpath("/html/body/ul/li[6]/form/a")).click();
	    }

	    
	    public void update_items() throws InterruptedException {
	        driver.findElement(By.id("edit-submit-3")).click();
	    }
	    
	    public MainPage(WebDriver driver) {
	        this.driver = driver;
	    }
	}




