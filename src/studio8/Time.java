package studio8;


public class Time {
	
	
	private int hour;
	private int minute;
	private boolean format;
	
	/**
	 * Constructor for the Time class.
	 * @param hour an integer from 0 to 23 representing the hour
	 * @param minute an integer from 0 to 59 representing the minute
	 * @param format a boolean representing the format (true for 24-hour format, false for 12-hour format)
	 */
	public Time(int inihour, int iniminute, boolean iniformat) {
	    hour = inihour;
	    minute = iniminute;
	    format = iniformat;
	}
	
	public void tostring() {
		String a = this.hour + ":" + this.minute;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Time t1 = new Time(11, 13, true);
		t1.tostring();
    	
    }

}