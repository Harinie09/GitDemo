package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class session1 {
	@Parameters({"URL"})
	@BeforeTest
	public void bfrTest2(String urlname) {
		System.out.println("Before Test session 1");
		
	}
	@Test(groups = {"smoke"})
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Session 1 -1");

	}
	@Test
	public void print2() {
		System.out.println("Session 1 -2");
	}
	@AfterTest
	public void printAfterTest() {
		System.out.println("After Test");
	}
	@BeforeSuite
	public void BfeSuite() {
		System.out.println("Before suite");
	}
}

