package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void testApp() 
	{
   System.setProperty("webdriver.gecko.driver","C:\\Users\\sudha\\Common\\geckodriver.exe" );
   WebDriver driver = new FirefoxDriver();
   driver.get("http://google.com/");
	}
}
