package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	
	public Date(int init_month, int init_day, int init_year) {
		month = init_month;
		day = init_day;
		year = init_year;	
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	
	public int getmonth() {
		return this.month;
	}
	public int getday() {
		return this.day;
	}
	public int getyear() {
		return this.year;
	}
	
	public boolean equals(Date a) {
		if(this.day == a.getday() && this.month == a.getmonth() && this.year == a.getyear()) {
			return true;
		}

		else return false;
	}
	
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
    	
    	// Create a List
    	LinkedList<Date> list = new LinkedList<Date>();
    	Date d1 = new Date(12,13,2011);
    	Date d2 = new Date(12,13,2011);
    	System.out.println(d1.equals(d2));
    	
    	list.add(d1);
    	list.add(d2);
    	System.out.println(list);
    	
    	// Create a set
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d1);
    	System.out.println(set);

    }
    
    

}
