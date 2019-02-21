package TestNgEx;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert2 {
	
	@Test
	public void test1() {
		SoftAssert Assertion = new SoftAssert();
		System.out.println("Begin assert concept");
		Assertion.assertEquals(11, 13);
		System.out.println("Boolean verified");
		Assertion.assertEquals(12, 15);
		System.out.println("Integer verified");
		Assertion.assertAll();
		System.out.println("Completed");
	}
	@Test
	public void Hardassert() {
		System.out.println("Test completed");
		Assert.assertEquals(12, 13);
		System.out.println("Assertion completed");
	}

}
