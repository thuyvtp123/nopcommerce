package commons;

import java.util.Collections;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractTest {
	private WebDriver driver;
	
	
protected WebDriver getBrowserDriver(String browserName)
{
	if (browserName.equals("firefox_ui")) {
		//System.setProperty("webdriver.gecko.driver", source_folder + "//browserDriver//geckodriver");
		WebDriverManager.firefoxdriver().setup();// dung cai nay thi ko can cai tren, co the bo thu muc browserDirver
		driver = new FirefoxDriver();
	} else if (browserName.equals("chrome_ui")) {
		//System.setProperty("webdriver.chrome.driver", source_folder + "//browserDriver//chromedriver");
	
		WebDriverManager.chromedriver().setup()	;
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("userAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		driver = new ChromeDriver();

	}else if (browserName.equals("firefox_headless")) {
		//System.setProperty("webdriver.chrome.driver", source_folder + "//browserDriver//chromedriver");
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		driver = new FirefoxDriver(options);

	}else if (browserName.equals("chrome_headless")) {
		//System.setProperty("webdriver.chrome.driver", source_folder + "//browserDriver//chromedriver");
		WebDriverManager.chromedriver().setup()	;
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);

	}else {
		throw new RuntimeException("please input valid browser name value");
	}
	return driver;
}

public int getRandomNumber() {
	Random rand = new Random();
	return rand.nextInt(999999);
}
}
