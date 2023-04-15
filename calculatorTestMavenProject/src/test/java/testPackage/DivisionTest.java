package testPackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.CustomListner;
import pagePackage.HomePage;

@Listeners(CustomListner.class)
public class DivisionTest extends BaseTest{
	
	@Test
	public void testMultiplication() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.division();
		
	}

}
