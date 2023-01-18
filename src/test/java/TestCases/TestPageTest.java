package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPageTest {
	@AfterMethod
	public  void syso6() {
		System.out.println("@AfterMethod");
		}
	
	@AfterTest
	public  void syso4() {
		System.out.println("@AfterTest");
		}
	
	
	@AfterSuite
	public void syso1()
	{
		System.out.println("@AfterSuite");
	}
	@Test
	public  void syso7() {
		System.out.println("test");
		}
	
	
	@BeforeSuite
	public  void syso() {
		System.out.println("@BeforeSuite");
		}
	@BeforeTest
	public  void syso3() {
		System.out.println("@BeforeTest");
		}
	
	@BeforeMethod
	public  void syso5() {
		System.out.println("@BeforeMethod");
		}
	
	
	
	
	
	

}
