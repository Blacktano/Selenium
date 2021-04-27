package Testowy;
import java.util.concurrent.TimeUnit;


public class First {
public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.pl/");
}
}
