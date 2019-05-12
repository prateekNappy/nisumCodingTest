package main.java.com.nisum.coding;

public class Range implements Comparable<Range> {
	
	private int start;
	private int end;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Range o) {
		return Integer.compare(this.start, o.start);
	}

}
