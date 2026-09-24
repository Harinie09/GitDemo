package testing;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class session3 {
	
	
	@BeforeMethod
	public void BeforeMethods() {
		System.out.println("Before Method beforeMethod from 3rd session");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test from 3rd session");
	}
	@BeforeClass
	public void Beforeclasses() {
		System.out.println("Before Class from 3rd session");
	}
	@Test
	public void webTest() {
		System.out.println("session 3 -Print webTest");
	}
	
	@Test
	public void apiTest(){
		System.out.println("session 3 -Print Api Test");
	}
	
	@Test
	public void mobileTest() {
		System.out.println("session 3 -Print Mobile Test");
	}
	@Test
	public void mobileLogin() {
		System.out.println("session 3 -Print Mobile Login Test");
	}
	@Test
	public void mobileLogOut() {
		System.out.println("session 3 -Print Mobile Log Out Test");
	}
	@AfterMethod
	public void AfterMethods() {
		System.out.println("After Method from 3rd session");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test from 3rd session");
	}
	@AfterClass
	public void AfterClasses() {
		System.out.println("After Class from 3rd session");
	}
	@Parameters({"URL"})
	@Test
	public void dependencies(String urlname){
		System.out.println("session 3-suite level parameter");
		System.out.println(urlname);
	}
	
	

}
