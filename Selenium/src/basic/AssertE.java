package basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertE {
	@Test
    public void Test1() {
		
		Assert.assertEquals(12, 13);
    	
    }
	@Test
	public void Test2() {
		Assert.assertEquals("Hello", "Hello");
	}
	@Test
	public void Test3() {
		String str = "Sai Krishna";
		Assert.assertTrue(str.contains("Sai Krishna"),"Defined element is verified");
	}
}
