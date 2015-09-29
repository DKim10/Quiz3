package MainPackage;

public class Triangle extends GeometricObject {

	//creates private data field side1 stores as double
	private double side1;

	//creates private data field side2 stores as double
	private double side2;

	//creates private data field side3 stores as double
	private double side3;

	//Default constructor contains no arguments creates default triangle sides to 1.0
	public Triangle(){
		super();
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	/**Constructor for triangle takes in
	 *Parameters: side1, side2, side3 
	 *Stores a double */
	public Triangle(double side1,double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//get method for side1
	public double getside1(){
		return side1;
	}
	
	//set method for side1
	public void setside1(double side1){
		this.side1 = side1;
	}

	//get method for side2
	public double getside2(){
		return side2;
	}
	
	//set method for side2
	public void setside2(double side2){
		this.side2 = side2;
	}
	
	//get method for side3
	public double getside3(){
		return side3;
	}
	
	//set method for side3
	public void setside3(double side3){
		this.side3 = side3;
	}

	//Override method used since GeometricObject use same method name
	//forces getPerimeter() to run
	@Override
	public double getPerimeter(){
		/**Given the sides, finds perimeter of triangle
		 *Returns the perimeter of triangle */
		double Perimeter = this.getside1() + this.getside2() + this.getside3();
		return Perimeter;
	}
	
	//Override method used since GeometricObject use same method name
	//forces getArea() to run
	@Override
	public double getArea(){
		/**Given the sides, finds area using Heron's formula
		 * s : holds half the value of perimeter of triangle
		 *Returns area of triangle */
		double s = (getPerimeter())/2;
		double Area = Math.sqrt(s*(s-this.getside1())*(s-this.getside2())*(s-this.getside3()));
		
		return Area;
	}
	
	public String toString(){
		/** String - holds sting teling area and Perimeter of triangle
		 *returns the area and perimeter of triangle */
		String description = "The Triangle area is " + getArea() + ".\n The triangle perimeter is " 
																					+ getPerimeter();
		return description;
	}
}
