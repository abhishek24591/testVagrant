package TestVagrant_Automation.TestVgrant_Automation;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NDTV {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\chromedriver_win32_version85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileReader propertiesFile = new FileReader("F:\\TestVagrant\\TestVgrant_Automation\\Object_repository\\object.properties");
		Properties p = new Properties(propertiesFile);
		String url = p.get(appurl);
		driver.get("https://www.ndtv.com/");
		
		
		

	}

}
