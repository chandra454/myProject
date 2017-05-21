package SonicWall.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SonicWall.Pages.BasePage;
import SonicWall.Pages.all_Implementations;
import SonicWall.Pages.myHomepageElements;
@Listeners(TestNGListner.class)
public class AwinningPartnership_Test {


	BasePage Sonic_Interface = new all_Implementations();
	public static WebDriver driver;
	myHomepageElements HomePage = new myHomepageElements();
	String HomeUrl ="https://awinningpartnership.com/";
	
	public File my =new File("C:\\Users\\ChandrashekarChary\\Desktop\\TestResults\\chhhh.txt");
	
	public BufferedWriter buffWrite;
	public FileWriter writeF;
	
	@Test(priority =1)
	  public void AWP_ToolBar_Checking() throws IOException {
		  driver = Sonic_Interface.DriverClass();
		  driver.get(HomeUrl);
		  Sonic_Interface.timeSleep(5000);
		  writeF = new FileWriter(my,true);
	      buffWrite = new BufferedWriter(writeF);
	      buffWrite.write("\n TESTCASE: check all links redirecting aWinningPartnership.com homepage. ");
		  List<WebElement> AllPost = driver.findElements(By.xpath("html/body/div[1]/div[2]/div/ul/li"));
		  for(int i=2;i<=AllPost.size();i++)
		  {
			  String s = "html/body/div[1]/div[2]/div/ul/li["+i+"]/a";
			  driver.findElement(By.xpath(s)).click();
			  Sonic_Interface.timeSleep(2000);
			  buffWrite.newLine();
			  buffWrite.write("Page able to load: '"+ driver.getTitle()+"'--CHECKED.");
			
			  driver.navigate().back();		
			  Sonic_Interface.timeSleep(2000);
		  }
		  buffWrite.newLine();
		  buffWrite.close(); 
	}
	
	
	@Test(priority =2)
	  public void AWP_Register_Form_Checking() throws IOException {
		  driver = Sonic_Interface.DriverClass();
		  driver.get(HomeUrl);
		  Sonic_Interface.timeSleep(5000);
		  
		  writeF = new FileWriter(my,true);
	      buffWrite = new BufferedWriter(writeF);
	      buffWrite.write("\n TESTCASE: check Register Form: aWinningPartnership.com homepage. ");
		  driver.findElement(By.xpath("html/body/div[1]/div[1]/div/ul/li[1]/a")).click();
		  
		  Sonic_Interface.timeSleep(2000);
		  buffWrite.newLine();
		  buffWrite.write("Page able to load: '"+ driver.getTitle()+"'--CHECKED.");
		  List<WebElement> AllPost = driver.findElements(By.xpath("html/body/div[1]/div[3]/div[1]/div[1]/div[1]/form/div[1]/div[1]/ul[1]/div[1]/li"));
		  System.out.println(AllPost.size());
		  WebElement Element;
		  for(int i=2;i<=AllPost.size();i++)
		  {
			  String s1 = "html/body/div[1]/div[3]/div[1]/div[1]/div[1]/form/div[1]/div[1]/ul[1]/div[1]/li["+i+"]/input";
			  
			  //WebElement Element = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div[1]/div[1]/form/div[1]/div[1]/ul[1]/div[1]/li["+i+"]/input"));
			  
			  
		  switch(i){
		  case 2:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("Test");
			  break;
		  case 3:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("last Test");
			  break;
		  case 4:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("1234567890");
			  break;
		  case 5:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("My Test Title");
			  break;
		  case 6:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("Sonic Test");
			  break;
		  case 7:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("sonicwall.com");
			  break;
		  case 8:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("200 Test");
			  break;
		  case 9:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("Texas");
			  break;
		  case 10:
			  WebElement mySelectElement = driver.findElement(By.xpath(".//*[@id='id_state']"));
			  Select dropdown= new Select(mySelectElement);
			  dropdown.selectByVisibleText("Florida");
			  break;
		  case 11:
			  WebElement mySelectElement2 = driver.findElement(By.xpath(".//*[@id='id_country']"));
			  Select dropdown2= new Select(mySelectElement2);
			  dropdown2.selectByVisibleText("China");
			  break;
		  case 12:
			  Element = driver.findElement(By.xpath(s1));
			  Element.click();
			  Element.sendKeys("08002");
			  
			  break;
			  
		  default:
			  break;
		  
		  }
		    
		  
		  }
		  
		  
		  List<WebElement> AllPost2 = driver.findElements(By.xpath(".//*[@id='general']/ul/li"));
		  System.out.println(AllPost.size());
		  
		  for(int j=1;j<=AllPost2.size();j++)
		  {
			  String s = ".//*[@id='general']/ul/li["+j+"]/input";
			  driver.findElement(By.xpath(s)).sendKeys("abc@cde.com");
			    
		  }
		  buffWrite.newLine();
		  buffWrite.write("All data in Form filled--CHECKED.");
		  buffWrite.newLine();
		  buffWrite.close();
	}
	@Test(priority =3)
	  public void AWP_PartnerLogin_Checking() throws IOException {
		  driver = Sonic_Interface.DriverClass();
		  driver.get(HomeUrl);
		  Sonic_Interface.timeSleep(5000);
		  writeF = new FileWriter(my,true);
	      buffWrite = new BufferedWriter(writeF);
	      buffWrite.write("\n TESTCASE: check PartnerLogin aWinningPartnership.com homepage.");
	      
		  driver.findElement(By.xpath("html/body/div[1]/div[1]/div/ul/li[2]/a")).click();
		  
		  Sonic_Interface.timeSleep(2000);
		  buffWrite.newLine();
		  buffWrite.write("Page able to load: '"+ driver.getTitle()+"'--CHECKED.");
		  driver.findElement(By.xpath(".//*[@id='id_username']")).sendKeys("MyUsername");
		  driver.findElement(By.xpath(".//*[@id='id_password']")).sendKeys("password123");
		  driver.findElement(By.xpath(".//*[@id='content']/div/div/form/div[2]/button")).click();
		  buffWrite.newLine();
		  buffWrite.write("Username and password fields:'--CHECKED.");
		  buffWrite.newLine();
		  buffWrite.close();
		  
		  
	}
	
	@Test(priority =4)
	  public void HomePage_Available_Resources_Checking() throws IOException {
		  driver = Sonic_Interface.DriverClass();
		  driver.get(HomeUrl);
		  Sonic_Interface.timeSleep(5000);
		  writeF = new FileWriter(my,true);
	      buffWrite = new BufferedWriter(writeF);
	      buffWrite.write("\n TESTCASE: check Available_Resources: aWinningPartnership.com homepage.");
	      
		  
		  String winHandleBefore = driver.getWindowHandle();
		  List<WebElement> AllPost = driver.findElements(By.xpath(".//*[@id='content']/div[2]/div[1]/ul[2]/li"));
		  //System.out.println(AllPost.size());
		  Sonic_Interface.timeSleep(2000);
		  for(int i=1;i<=AllPost.size();i++)
		  {
			  String s = ".//*[@id='content']/div[2]/div[1]/ul[2]/li["+i+"]/a";
			  
			  driver.findElement(By.xpath(s)).click();
			  Sonic_Interface.timeSleep(2000);
			  
			  System.out.println(driver.getTitle());
			 
			  driver.switchTo().window(winHandleBefore);
	
			  Sonic_Interface.timeSleep(4000);
			  
		  }
		  buffWrite.newLine();
		  buffWrite.write("Page able to load: All resources'--CHECKED.");
		  buffWrite.newLine();
		  buffWrite.close();
		  
	}
	
	

}
