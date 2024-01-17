
public class Circle {
	//The public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";

	private double radius = 1.0;
	private String color = "red";

//default constructs a Circle with default radius and color
	//1st (default) Constructor

	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
//Constructs a Circle with the given radius and default
	//2nd Constructor
	Circle(double radius){
		this.radius= radius;
		this.color =DEFAULT_COLOR;
	}
	//3th
	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	//Return the radius-the public getter for private attribute radius
	public double getRaduius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return "Circle[radius="+this.radius+", color = "+this.color+"]";
		//return "Circle[radius="+getradius+", color = "+color+"]";
	}
	public double getArea(){
	return Math.PI*Math.pow(radius, 2);
	}
	public double getCircumference() {
		return 2.0*Math.PI*radius;
	}
	
}