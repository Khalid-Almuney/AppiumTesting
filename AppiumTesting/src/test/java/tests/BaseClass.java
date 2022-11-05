package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
static AppiumDriver<MobileElement> driver;
	
@BeforeTest
public void setup() {
	try {
	DesiredCapabilities caps=new DesiredCapabilities();
	
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S22+");
	caps.setCapability(MobileCapabilityType.UDID, "RFCT506B0WL");
	caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	//caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	
	driver=new AppiumDriver<MobileElement>(url,caps);
	
	
	}catch(Exception exp) {
		exp.printStackTrace();
	}
}
//@Test
//public void test() {
//	System.out.println("here");
//}

@AfterTest
public void teardown() {
	//driver.close();
}
}
