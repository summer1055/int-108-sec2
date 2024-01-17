
public class Date {
	//private 3 attribute
	private int year;
	private int month;
	private int day;



public Date(int year,int month, int day) {
	this.year=year;
	this.month=month;
	this.day=day;
	}

public int getYear() {
	return year=year;
	}
public int getMonth() {
	return month=month;
}
public int getDay() {
	return day=day;
}
public void setYear(int year) {
	this.year=year;
}
public void setMonth(int month) {
	this.month=month;
}
public void setDay(int day) {
	this.day=day;
}
public String toString() {
	//use built-in function String.format() to form a formatted String
	//Specifier "0" to print leading zero ex 01/02/2024
	return String.format("%02d/%02d/%4d", month,day,year);
	
}
public void setDate(int year,int month, int day) {
	this.year=year;
	this.month=month;
	this.day=day;
}
}