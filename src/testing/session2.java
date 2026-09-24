package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class session2 {
	
	@Test(groups = {"smoke"})
	public void print3() {
		System.out.println("sessin 2- 1");
	}
	@BeforeTest
	public void printBefore() {
		System.out.println("BeforeTest -2");
	}
	@AfterSuite
	public void AfrSuite() {
		System.out.println("After suite");
	}
	@Parameters({"URL","username"})
	@Test
	public void print4(String urlname,String username) {
		System.out.println(urlname);
		System.out.println(username);
	}
	
	public void gitMetheod() {
		System.out.println("First edit method By Gitstuff user");
		System.out.println(" only in develope");
	}
//	@DataProvider
//	public Object[][] getdata() {
//		Object[][] data =new Object[3][2];
//		//set 1
//		data[0][0]="Harini";
//		data[0][1]="Harini09";
//		//set 2
//		data[1][0]="Srini";
//		data[1][1]="srini";
//		//set 3
//		data[2][0]="Thivi";
//		data[2][1]="Thivi";
//		return data;
//	}
//	@Test(dataProvider="getdata")
//	public void dataPrint(String username,String password) {
//		System.out.println(username);
//		System.out.println(password);
//	}
}
