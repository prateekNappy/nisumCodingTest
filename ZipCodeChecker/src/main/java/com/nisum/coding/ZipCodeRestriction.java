package main.java.com.nisum.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZipCodeRestriction {

	private static List<Range> findMinimumInputRestrictions(List<Range> inputRestrictions) {
		List<Range> outputRestrictions = new ArrayList<Range>();
		// Sort the input based on start value of Range
		Collections.sort(inputRestrictions);

		int start = 0;
		int end = 0;
		for (Range range : inputRestrictions) {
			// Add directly without any comparisons for 1st input
			if (outputRestrictions.size() == 0) {
				outputRestrictions.add(new Range(range.getStart(), range.getEnd()));
			} else {
				// Check the Range against the latest value added in outputRestrictions
				if (RangeUtil.isSubset(range, outputRestrictions.get(outputRestrictions.size() - 1))) {
					// No need to do anything is present Range is subset
					continue; 
				} else if (RangeUtil.isSuperSet(range, outputRestrictions.get(outputRestrictions.size() - 1))) {
					// If present Range is super set then, remove the latest in output and add the present
					outputRestrictions.remove(outputRestrictions.size() - 1);
					outputRestrictions.add(range);
				} else if (RangeUtil.isInterceptingLeft(range, outputRestrictions.get(outputRestrictions.size() - 1))) {
					// If present range is extended to left, then remove latest from output and add new keeping the start of present and end of latest
					end = outputRestrictions.get(outputRestrictions.size() - 1).getEnd();
					outputRestrictions.remove(outputRestrictions.size() - 1);
					outputRestrictions.add(new Range(range.getStart(), end));
				} else if (RangeUtil.isInterceptingRight(range,
						// If present range is extended to right, then remove latest from output and add new keeping the end of present and start of latest
					outputRestrictions.get(outputRestrictions.size() - 1))) {
					start = outputRestrictions.get(outputRestrictions.size() - 1).getStart();
					outputRestrictions.remove(outputRestrictions.size() - 1);
					outputRestrictions.add(new Range(start, range.getEnd()));
				} else if (RangeUtil.isNonIntercepting(range, outputRestrictions.get(outputRestrictions.size() - 1))) {
					// If present range is not intercepting, then add directly 
					outputRestrictions.add(range);
				}
			}
		}
		return outputRestrictions;
	}
	
	  /*// Use this to Test
	  public static void main(String[] args) {
		List<Range> inputRestrictions = new ArrayList<Range>();
		inputRestrictions.add(new Range(94133,94133));
		inputRestrictions.add(new Range(94200,94299));
		inputRestrictions.add(new Range(94600,94699));
		
		List<Range> outputRestrictions = findMinimumInputRestrictions(inputRestrictions);
		
		for(Range range : outputRestrictions) {
			System.out.println(range.getStart()+","+range.getEnd());
		}
	}*/

}
