package work5;

import java.util.Scanner;

public class starSquare {

//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

	private int width;
	private int height;

	public starSquare() {
		System.out.println("請輸入長");
		Scanner h = new Scanner(System.in);
		this.height = h.nextInt();
		System.out.println("請輸入寬");
		Scanner w = new Scanner(System.in);
		this.width = w.nextInt();
	}

	public void getStarSquare() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		starSquare star = new starSquare();
		star.getStarSquare();

	}

}
