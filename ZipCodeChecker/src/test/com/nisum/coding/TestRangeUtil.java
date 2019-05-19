package test.com.nisum.coding;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.com.nisum.coding.Range;
import main.java.com.nisum.coding.RangeUtil;

/**
 * Class handles the utility methods related to Range Object
 * @author pagrawal
 *
 */
public class TestRangeUtil {
	
	private Range set;
	
	@Before
	public void init() {
		set = new Range(15000, 20000);
	}
	
	@Test
	public void testIsSubsetTrue() {
		Range toCheck = new Range(16000, 18000);
		Assert.assertTrue(RangeUtil.isSubset(toCheck, set));
	}
	
	@Test
	public void testIsSubsetFalse() {
		Range toCheck = new Range(14000, 18000);
		Assert.assertFalse(RangeUtil.isSubset(toCheck, set));
	}
	
	@Test
	public void testIsSuperSetTrue() {
		Range toCheck = new Range(10000, 25000);
		Assert.assertTrue(RangeUtil.isSuperSet(toCheck, set));
	}
	
	@Test
	public void testIsSuperSetFalse() {
		Range toCheck = new Range(14000, 18000);
		Assert.assertFalse(RangeUtil.isSuperSet(toCheck, set));
	}
	
	@Test
	public void testIsNonInterceptingTrue() {
		Range toCheck = new Range(11000, 14000);
		Assert.assertTrue(RangeUtil.isNonIntercepting(toCheck, set));
	}
	
	@Test
	public void testIsNonInterceptingFalse() {
		Range toCheck = new Range(11000, 16000);
		Assert.assertFalse(RangeUtil.isNonIntercepting(toCheck, set));
	}

	@Test
	public void testIsInterceptingLeftTrue() {
		Range toCheck = new Range(11000, 15000);
		Assert.assertTrue(RangeUtil.isInterceptingLeft(toCheck, set));
	}
	
	@Test
	public void testIsInterceptingLeftFalse() {
		Range toCheck = new Range(17000, 21000);
		Assert.assertFalse(RangeUtil.isInterceptingLeft(toCheck, set));
	}
	
	@Test
	public void testIsInterceptingRightTrue() {
		Range toCheck = new Range(17000, 21000);
		Assert.assertTrue(RangeUtil.isInterceptingRight(toCheck, set));
	}
	
	@Test
	public void testIsInterceptingRightFalse() {
		Range toCheck = new Range(14000, 18000);
		Assert.assertFalse(RangeUtil.isInterceptingRight(toCheck, set));
	}

	
}
