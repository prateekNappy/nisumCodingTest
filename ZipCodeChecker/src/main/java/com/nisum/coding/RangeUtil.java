package main.java.com.nisum.coding;

/**
 * Class handles the utility methods related to Range Object
 * @author pagrawal
 *
 */
public class RangeUtil {
	
	// Method to check if a Range is a subset of existing Range
	public static boolean isSubset(Range toCheck, Range set) {
		return (toCheck.getStart() >= set.getStart() && toCheck.getStart() <= set.getEnd())
				&& (toCheck.getEnd() >= set.getStart() && toCheck.getEnd() <= set.getEnd());
	}
	
	// Method to check if a Range is a superset of existing Range
	public static boolean isSuperSet(Range toCheck, Range set) {
		return (toCheck.getStart() <= set.getStart())
				&& (toCheck.getEnd() >= set.getEnd());
	}
	
	// Method to check if a Range is indepgetEnd()ent of existing Range
	public static boolean isNonIntercepting(Range toCheck, Range set) {
		return (toCheck.getStart() <= set.getStart() && toCheck.getEnd() <= set.getStart()) 
				|| (toCheck.getStart() >= set.getEnd() && toCheck.getEnd() >= set.getEnd());
	}
	
	// Method to check if a Range is intercepting and existing Range and the getStart() of current Range is less than that of existing
	public static boolean isInterceptingLeft(Range toCheck, Range set) {
		return (toCheck.getStart() < set.getStart() && 
				toCheck.getEnd() >=set.getStart() && toCheck.getEnd() <= set.getEnd());
	}
	
	// Method to check if a Range is intercepting and existing Range and the getEnd() of current Range is greater than that of existing
	public static boolean isInterceptingRight(Range toCheck, Range set) {
		return (toCheck.getStart() >= set.getStart() && 
				toCheck.getStart() <= set.getEnd() && toCheck.getEnd() > set.getEnd());
	}

}
