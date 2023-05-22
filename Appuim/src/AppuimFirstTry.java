import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppuimFirstTry {
	DesiredCapabilities caps = new DesiredCapabilities();

	AndroidDriver driver;

	@BeforeTest
	public void myBeforeTest() {

		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "AhmadBrandNewPhone"); 

		File CalculatorApp = new File("src/MyApps/calculator.apk");

		caps.setCapability(MobileCapabilityType.APP, CalculatorApp.getAbsolutePath());
       }



	@Test()
	public void Open_the_application() throws MalformedURLException {
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		for(int i =9 ;i>=0 ; i--) {
			driver.findElement(By.id("com.google.android.calculator:id/digit_"+i)).click();
		}
	}
 
}
