import java.util.*;
import java.io.*;
public class Employee {

	private  String dept;
	
	public void setdept(String dept) {
		this.dept = dept;
		
		
	}
	
	public String getDept() {
		return this.dept;
		
	
	}
	public void header() {
		for(int i=1; i<=80; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	

}
