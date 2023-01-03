package test23;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base23.Browser;
import POM_Blaze.HP_Page;
import utility23.Utility56;

public class TC15 extends Browser{
	 HP_Page h1;
	@BeforeClass
	public void kk() {
		OpenBrowser22();
		h1=new HP_Page(driver);
		
	}
	@BeforeMethod
	public void kk23() {
		Reporter.log("login app", true);
	}
	@Test
	public void Verifytitle() throws Throwable, Throwable {
		String exp = h1.title();
		          String act = Utility56.getdata12(0, 0);
		          assertEquals(exp,act,"If both are different then TC15 fails");
			
	}

}
