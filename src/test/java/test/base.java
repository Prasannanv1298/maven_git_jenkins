package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	
	
public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	

	public WebDriver getDriver() {
		return this.driver.get();
	}


	public void setDriver(WebDriver driver) {
		this.driver.set(driver);
	}

	public void launch_browser(String browser) {
		switch (browser) {
		case "Chrome":
			setDriver( new ChromeDriver());
			System.out.println("Chrome browser launched successfully");
			break;

		case "Edge":
			setDriver(new EdgeDriver());
			System.out.println("Edge browser launched successfully");
			break;

		default:
			System.out.println("No suitable browser  found");
			break;
		}
}
}