package work5;

public class MyRectangleMain {

//	(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果

	public static void main(String[] args) {

		MyRectangle a1 = new MyRectangle();
		a1.setWidth(10);
		a1.setDepth(20);
		System.out.println(a1.getArea());

//	(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果

		MyRectangle a2 = new MyRectangle(10, 20);
		System.out.println(a2.getArea());

	}

}
