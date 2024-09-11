package ecap_framework;

import org.testng.annotations.Test;

public class Testing_priority {
	@Test(priority=2)
	public void testcase() {
		System.out.println("test case 1");
	}
	@Test //it consider as zero priority  //(priority=0) 
	public void testcas2() {
		System.out.println("test case 2");
	}
	@Test(priority=-1)
	public void testcase3() {
		System.out.println("test case 3");
	}
	@Test(priority=4)
	public void testcase4() {
		System.out.println("test case 4");
	}

}
