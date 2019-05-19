package test.com.nisum.coding;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.nisum.coding.Range;
import main.java.com.nisum.coding.ZipCodeRestriction;

public class TestZipCodeRestriction {

	@Test
	public void testFindMinimumInputRestrictionsTrue() {
		List<Range> inputRestrictions = new ArrayList<Range>();
		inputRestrictions.add(new Range(94200,94299));
		inputRestrictions.add(new Range(94210,94699));
		
		List<Range> outputRestrictions = ZipCodeRestriction.findMinimumInputRestrictions(inputRestrictions);
		Assert.assertTrue(outputRestrictions.size() == 1);
	}
	
	@Test
	public void testFindMinimumInputRestrictionsFalse() {
		List<Range> inputRestrictions = new ArrayList<Range>();
		inputRestrictions.add(new Range(94200,94299));
		inputRestrictions.add(new Range(94310,94699));
		
		List<Range> outputRestrictions = ZipCodeRestriction.findMinimumInputRestrictions(inputRestrictions);
		Assert.assertFalse(outputRestrictions.size() == 1);
	}
}
