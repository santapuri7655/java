package Testing;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test001 {
	
	@Test
	public void test1() {
		System.setProperty("webdriver.gecko.driver", "/Users/radhikasantapuri/Downloads/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

}
