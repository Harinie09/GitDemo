package testing;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public class session4 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("session 4 before method");
	}
	@Test
	//(dependsOnMethods ={"dependencies"})
	public void seleniumTesting(){
		System.out.println("session 4-selenium webTest");
	}
	
	@Test(groups = {"smoke"})
	public void playwrightTesting(){
		System.out.println("session 4-playwrightTesting webTest");
	}
	
	

}
