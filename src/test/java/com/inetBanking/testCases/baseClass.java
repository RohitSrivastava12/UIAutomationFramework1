package com.inetBanking.testCases;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.inetBanking.utilities.inetBankingExtentManager;
import com.inetBanking.utilities.inetBankingReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.Logger;

public class baseClass {

	inetBankingReadConfig readconfig = new inetBankingReadConfig();
	public String usname = readconfig.getuserName();
	public String passwd = readconfig.getPassword();
	public String expTitle = readconfig.getExpectedTitle();
	public String url = readconfig.getUrl();
	public static WebDriver driver;
	public static Logger Logger;

	@BeforeSuite
	public void startCapturingExtentReport() {
		inetBankingExtentManager.setExtent();
	}

	// @Parameters("browser")
	@BeforeClass
	public void setup(@Optional("chrome") String br) {
		if (br.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().browserVersion("111.0.5563.65").setup();
			driver = new ChromeDriver(options);
		} else if (br.equals("msedge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		Logger = org.apache.log4j.Logger.getLogger("inetBanking");
		PropertyConfigurator.configure("log4j.properties");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@AfterSuite
	public void stopCapturingExtentReports() {
		inetBankingExtentManager.tearDownExtent();

	}

}
