package UGitHub;

import org.testng.annotations.Test;

public class attributes {

	@Test
	public void flipkart() {
		System.out.println("flipkart");
	}

	@Test
	public void bbinstant() {
		System.out.println("bbinstant");
	}

	// if enabled is false, this method will not be executed
	@Test(enabled = false)
	public void swiggy() {
		System.out.println("swiggy");
	}

	// first bbinstant method will be executed and then executes on alphabet order
	@Test(dependsOnMethods = { "bbinstant", "myntra" })
	public void amazon() {
		System.out.println("amazon");
	}

	// if test is not executed in 5sec then we will get exception
	@Test(timeOut = 5000)
	public void myntra() throws InterruptedException {
		System.out.println("myntra");
		Thread.sleep(4000);
	}

}
