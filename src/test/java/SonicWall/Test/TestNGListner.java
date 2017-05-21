package SonicWall.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener{
public File my;
public BufferedWriter buffWrite;
public FileWriter writeF; 	
	public BufferedWriter mylog() throws IOException{
		my =new File("C:\\Users\\ChandrashekarChary\\Desktop\\TestResults\\MyLog.txt");
		
        
        writeF = new FileWriter(my,true);
        
        buffWrite = new BufferedWriter(writeF);
       
        //buffWrite.newLine();
//        buffWrite.write("chadnssssssssssssssssssssssddchu\n");
//        buffWrite.write("hecdcddddddddddddddddddddddddddddddddddddllo");
//        buffWrite.close();
        return buffWrite;
		
		
	}


	public void onTestFailure(ITestResult result) {
		
		BufferedWriter buffwrite=null;
		TestNGListner log = new TestNGListner();
		try {
			buffwrite = log.mylog();
			buffwrite.newLine();
			//buffwrite.write(s);
			//buffwrite.newLine();
			buffwrite.write("Status: FAILED ");
			buffwrite.newLine();
			buffwrite.write("--------------------------------------------------------------");
			buffwrite.newLine();
			
			//buffwrite.write(result.getName());
			buffwrite.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Test case failed details are:"+result.getName());
		
	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped & details are:"+result.getName());
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String s = "Test case Started & details are:";
		BufferedWriter buffwrite=null;
		TestNGListner log = new TestNGListner();
		try {
			buffwrite = log.mylog();
			buffwrite.newLine();
			buffwrite.write("--------------------------------------------------------------");
			buffwrite.newLine();
			buffwrite.write(s);
			buffwrite.newLine();
			buffwrite.write("--------------------------------------------------------------");
			buffwrite.newLine();
			buffwrite.write("TestCase Name: ");
			buffwrite.write(result.getName());
			buffwrite.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test case Started & details are:\n"+result.getName());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//String s = "Test case Success & details are:";
		BufferedWriter buffwrite=null;
		TestNGListner log = new TestNGListner();
		try {
			buffwrite = log.mylog();
			buffwrite.newLine();
			//buffwrite.write(s);
			//buffwrite.newLine();
			buffwrite.write("Status: SUCCESS ");
			buffwrite.newLine();
			buffwrite.write("--------------------------------------------------------------");
			buffwrite.newLine();
			
			//buffwrite.write(result.getName());
			buffwrite.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test case Success & details are:"+result.getName());
	}


	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
		
		
	
	
	
	}



