package SonicWall.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Request;

import SonicWall.Pages.BasePage;
import SonicWall.Pages.all_Implementations;
import SonicWall.Pages.myHomepageElements;
@Listeners(TestNGListner.class)
public class HomepageTest1  {

	public static WebDriver driver;
	
	BasePage Sonic_Interface = new all_Implementations();
	myHomepageElements HomePage = new myHomepageElements();
	String HomeUrl ="https://blog.sonicwall.com/";
	String videoUrl = "https://www.sonicwall.com/video/university-of-the-sciences-protects-its-students-and-keeps-threats-at-bay-875104/";
	//all_Implementations abab = new all_Implementations();
	public File my =new File("C:\\Users\\ChandrashekarChary\\Desktop\\TestResults\\chhhh.txt");
	
	public BufferedWriter buffWrite;
	public FileWriter writeF; 
	
  @Test(priority = 1)
  public void HomePage_MAIN_Checking() throws IOException {
	  driver = Sonic_Interface.DriverClass();
	  //File myfile = new File("C:\\phantomjs.exe");
	  //System.setProperty("phantomjs.binary.path",myfile.getAbsolutePath());
	  //DesiredCapabilities DesireCaps = new DesiredCapabilities();
	  //DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\phantomjs.exe");
	  //WebDriver driver = new PhantomJSDriver();
	  
	  driver.get(HomeUrl);
	  Sonic_Interface.timeSleep(5000);
	  List<String> Elements = HomePage.HomeElements();
	 // System.out.println(Elements.get(0).toString());
	  	
		writeF = new FileWriter(my,true);
        buffWrite = new BufferedWriter(writeF);
        buffWrite.write("\n TESTCASE: check all links redirecting blog.sonicwall.com homepage. ");
        for(int i=1;i<Elements.size();i++){
		  Sonic_Interface.timeSleep(2000);
		  driver.findElement(By.xpath(Elements.get(i).toString())).click();
		  
		  Sonic_Interface.timeSleep(2000);
		  System.out.println(driver.getTitle());
		  buffWrite.newLine();
		  
		  buffWrite.write("Page able to load: '"+ driver.getTitle()+"'--CHECKED.");
		  
		  driver.navigate().back();
		  Sonic_Interface.timeSleep(2000);
	  }
        buffWrite.close(); 
  }
  
  @Test(priority = 2)
  public void HomePage_MAIN_SearchButton_Checking() throws IOException {
	  driver = Sonic_Interface.DriverClass();
	  driver.get(HomeUrl);
	  
	  Sonic_Interface.timeSleep(5000);
	  writeF = new FileWriter(my,true);
      buffWrite = new BufferedWriter(writeF);
      buffWrite.write("\n TESTCASE: check SEARCH Button - blog.sonicwall.com homepage. ");
      //CODED
	  driver.findElement(By.xpath(".//*[@id='search-btn']")).click();
	  driver.findElement(By.xpath(".//*[@id='s']")).sendKeys("It’s a tragedy",Keys.RETURN);
	  
	  buffWrite.newLine();
	  buffWrite.write("Page able to load: '"+ driver.getCurrentUrl()+"'--CHECKED.");
	  buffWrite.close(); 
  }
  @Test(enabled=false)
  public void urlcheck() throws IOException{
	  driver = Sonic_Interface.DriverClass();
	  driver.get(videoUrl);
	  Sonic_Interface.timeSleep(5000);
	  
	  writeF = new FileWriter(my,true);
      buffWrite = new BufferedWriter(writeF);
      buffWrite.write("\n TESTCASE: check SEARCH Button - blog.sonicwall.com homepage. ");
      
	  //JavascriptExecutor js = (JavascriptExecutor)driver;
	  //js.executeScript("document.getElementById(\"player-wrapper\").play()");
	  WebElement video = driver.findElement(By.cssSelector("#player-wrapper"));

	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("arguments[0].play();", video);
	  //driver.findElement(By.cssSelector("#player-wrapper")).click();
	  js .executeScript("document.getElementById(\"player-wrapper\").click()");
	  js.executeScript("document.getElementsByClassName(\"oo_label.oo_duration\").innerHTML");
	  Sonic_Interface.timeSleep(5000);
	  //WebElement s1 = driver.findElement(By.xpath(".//*[@id='player-wrapper']/div/div[6]/div/div[2]/div[1]/div[3]"));
	  //String s = driver.findElement(By.cssSelector(".oo_label.oo_duration")).getText();
	  
	  //String expectedresult = (String)((JavascriptExecutor)driver).executeScript("return document.getElementsByClassName('oo_label.oo_duration').Val;");
	  
	  //System.out.println(expectedresult+"fsfsss");
	  
  }
  @Test(priority = 3) 
  public void HomePage_Form_SearchButton_Checking() throws IOException {
	  driver = Sonic_Interface.DriverClass();
	  driver.get(HomeUrl);
	  Sonic_Interface.timeSleep(5000);
	  
	  writeF = new FileWriter(my,true);
      buffWrite = new BufferedWriter(writeF);
      buffWrite.write("\n TESTCASE: check Form-SEARCH Button - blog.sonicwall.com homepage. ");
      
	  //driver.findElement(By.xpath(".//*[@id='searchform']/div/input")).click();
	  driver.findElement(By.xpath(".//*[@id='searchform']/div/input")).sendKeys("E-rate",Keys.RETURN);	
	  
	  buffWrite.newLine();
	  buffWrite.write("Page able to load: '"+ driver.getCurrentUrl()+"'--CHECKED.");
	  buffWrite.close(); 
  }
  @Test(priority = 4)
  public void HomePage_AWARDS_Image_Checking() throws IOException {
	  driver = Sonic_Interface.DriverClass();
	  driver.get(HomeUrl);
	  Sonic_Interface.timeSleep(5000);
	  
	  writeF = new FileWriter(my,true);
      buffWrite = new BufferedWriter(writeF);
      buffWrite.write("\n TESTCASE: check AWARDS Button - blog.sonicwall.com homepage. ");
      
	  String winHandleBefore = driver.getWindowHandle();
	  
	  driver.findElement(By.xpath(".//*[@id='black-studio-tinymce-2']/div/p[1]/a/img")).click();
	 
	  Sonic_Interface.timeSleep(2000);
	  System.out.println(driver.getTitle());
	  buffWrite.newLine();
	  buffWrite.write("Button is clickable--CHECKED.");
	  driver.switchTo().window(winHandleBefore);
	  //driver.navigate().back();
	  Sonic_Interface.timeSleep(2000);
	  driver.findElement(By.xpath(".//*[@id='black-studio-tinymce-2']/div/p[3]/a")).click();
	  buffWrite.newLine();
	  buffWrite.write("Button is clickable--CHECKED.");
	  Sonic_Interface.timeSleep(2000);
	  System.out.println(driver.getTitle());
	  
	  
	  buffWrite.close(); 
	  
	  
  }
  @Test(priority = 5)
  public void HomePage_Recent_Posts_Checking() throws IOException {
	  driver = Sonic_Interface.DriverClass();
	  driver.get(HomeUrl);
	  Sonic_Interface.timeSleep(5000);

	  writeF = new FileWriter(my,true);
      buffWrite = new BufferedWriter(writeF);
      buffWrite.write("\n TESTCASE: check RECENT posts links - blog.sonicwall.com homepage. ");
	  
	  List<WebElement> AllPost = driver.findElements(By.xpath(".//*[@id='recent-posts-2']/ul/li"));
	  for(int i=1;i<=AllPost.size();i++)
	  {
		  Sonic_Interface.timeSleep(2000);
		  String s = ".//*[@id='recent-posts-2']/ul/li["+i+"]/a";
		  driver.findElement(By.xpath(s)).click();
		  Sonic_Interface.timeSleep(2000);
		  buffWrite.newLine();
		  buffWrite.write("Page able to load: '"+ driver.getTitle()+"'--CHECKED.");
		  
		  driver.navigate().back();		
		  Sonic_Interface.timeSleep(2000);
	  }
	  buffWrite.close(); 
  
  
  }
  @Test(priority = 6)
  public void HomePage_Categories_Checking() {
	  driver = Sonic_Interface.DriverClass();
	  driver.get(HomeUrl);
	  Sonic_Interface.timeSleep(5000);
	  List<WebElement> AllPost = driver.findElements(By.xpath(".//*[@id='categories-2']/ul/li"));
	  System.out.println(AllPost.size());
	  Sonic_Interface.timeSleep(2000);
	  for(int i=1;i<=AllPost.size();i++)
	  {
		  String s = ".//*[@id='categories-2']/ul/li["+i+"]/a";
		  
		  driver.findElement(By.xpath(s)).click();
		  Sonic_Interface.timeSleep(2000);
		  System.out.println(driver.getTitle());
		  driver.navigate().back();		
		  Sonic_Interface.timeSleep(4000);
		  
	  }
  }
	  @Test(enabled=false)
	  public void HomePage_Tags_Checking() {
		  driver = Sonic_Interface.DriverClass();
		  driver.get(HomeUrl);
		  Sonic_Interface.timeSleep(5000);
		  List<WebElement> AllPost = driver.findElements(By.xpath(".//*[@id='tag_cloud-5']/div/a"));
		  System.out.println(AllPost.size());
		  Sonic_Interface.timeSleep(2000);
		  for(int i=1;i<=AllPost.size();i++)
		  {
			  String s = ".//*[@id='tag_cloud-5']/div/a["+i+"]";
			  Sonic_Interface.timeSleep(3000);
			  driver.findElement(By.xpath(s)).click();
			  Sonic_Interface.timeSleep(2000);
			  System.out.println(driver.getTitle());
			  driver.navigate().back();		
			  Sonic_Interface.timeSleep(1000);
			  
		  }
  
  
  }
  
  
  
  
  
  
  
  }
