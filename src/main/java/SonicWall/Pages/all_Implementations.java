package SonicWall.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class all_Implementations implements BasePage {
	public static WebDriver driver;
	
	public WebDriver DriverClass(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandrashekarChary\\Downloads\\chromedriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		//driver=new ChromeDriver();
		
		return driver;
		
	}
	
	
	public void timeSleep(int mm){
		
		try {
			Thread.sleep(mm);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
