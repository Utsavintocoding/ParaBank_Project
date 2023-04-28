package para_bank;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {


	public static WebDriver driver;
	public static Properties prop;
	
	public void initialize()
	{
			
			FirefoxOptions options=new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(options);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("Url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void tearDown()
	{
			driver.quit();
		
	}
	public void readPropertyFile()
	{
		String PropFilePath="C:\\Users\\utsav\\eclipse-workspace\\PARA_Bank\\keysValue\\Values.properties";
		prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream(PropFilePath);
			prop.load(fis);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}
