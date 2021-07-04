package AllTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		String s="hi";
		Assert.assertEquals( s, "hi");
}
	@Test
	public void test3() {
		Assert.assertFalse(true);
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(true, true);
	}
	
	
}
