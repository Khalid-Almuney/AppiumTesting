package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class SwiggyAppPhoneTest extends BaseClass {
	
@Test
public void openSwiggyPage() throws InterruptedException {
	driver.get("https://www.swiggy.com/");
	Thread.sleep(3000);
	//user enter place 
   this.user_enter_place_name();
	//user click enter
	this.hits_enter();
	//validate the results 
	this.user_is_navigated_to_search_results();
	
}

public void user_enter_place_name() {
	driver.findElement(By.xpath("//*[@id=\"location\"]")).sendKeys("Mumbai , Maharashtra, India");
	
}

public void hits_enter() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]/button[1]")).click();	
	
	Thread.sleep(3000);
	}

public void user_is_navigated_to_search_results() throws InterruptedException {
	driver.getPageSource().contains("restaurants");
	
	
}



}
