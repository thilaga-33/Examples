package First_Pro.First_Pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	WebDriver driver;
	
	public void launch_browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://azure.microsoft.com/en-in/products/devops");
		System.out.println(driver.getTitle());
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.launch_browser();
	}
}
