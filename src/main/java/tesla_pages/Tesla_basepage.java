package tesla_pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tesla_basepage
{
	public static WebDriver driver ;
	public static Properties prop;

	public void Homepage() throws IOException
	{
		try
		{
	    // reading file using file handling
		FileInputStream file = new FileInputStream("C:\\Users\\skumari\\eclipse-workspace\\Tesla_test\\src\\main\\java\\config.properties");
		prop = new Properties();
		prop.load(file);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}

	public void close()
	{
		driver.quit();
	}
}
