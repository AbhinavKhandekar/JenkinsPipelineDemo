package ak.com.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32_new\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

	}

}
