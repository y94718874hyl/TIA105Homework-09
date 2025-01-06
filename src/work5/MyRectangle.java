package work5;

public class MyRectangle {

//	(1) 有兩個double型態的屬性為width, depth
	private double width;
	private double depth;

//	(2) 有三個方法:	
	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		double area = depth * width;
		return area;
	}

//	(3) 有兩個建構子:
	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
