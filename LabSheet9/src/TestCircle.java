
public class TestCircle {

	public static void main(String[] args) {
		//test all constructors and toString()
		Circle c1 = new Circle(1.1,"blue");//call 3th Constructor
		System.out.print(c1);// or call toString() method c1.toStirng (but it lesser use)
		System.out.println();
		
		Circle c2 = new Circle(2.2);//call 2nd constructor
		System.out.println(c2);
		
		Circle c3 = new Circle();//call 3th constructor
		System.out.println(c3);
		
		//Test Setters and Getters
		c1.setRadius(3.3);
		c1.setColor("light blue");
		System.out.println(c1);
		System.out.println("The radius of c1 is "+c1.getRaduius());
		System.out.println("The radius of c1 is "+c1.getColor());

		//Test getArea() and getCircumfrence()
		//printf => format number only for C and also Java Script
		System.out.printf("\nThe area is : %.2f%n", c1.getArea());
		System.out.printf("The Circumfernce is : %.3f", c1.getCircumference());
	}

}
