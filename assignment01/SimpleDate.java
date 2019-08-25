package assignment01;
/**
 * Class to store information about a personal computer with the
 * basic information stored in an advertisement for a computer.
 *
 * @author Ryan Klein
 *
 */
public class SimpleDate {
	public int year;
	public int month;
	public int day;

	public static SimpleDate of(int yr, int m, int d) {
		SimpleDate returnValue = new SimpleDate();
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;
		return returnValue;
	}

	public boolean before (SimpleDate other) {
		return (year <= other.year && month <= other.month && day < other.day);
	}
}
