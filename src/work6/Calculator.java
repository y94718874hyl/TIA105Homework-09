package work6;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
	private int x;
	private int y;
	
	public Calculator() {

	}

	public void powerXY() throws CalException {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x值");
		this.x = sc.nextInt();
		
		System.out.println("請輸入y值");
		this.y = sc.nextInt();
		
		
		
		int re = (int) Math.pow(x, y);
		if (x == 0 || y == 0) {

			throw new CalException("0的0次方沒有意義");

		} else if (y < 0 || x < 0) {

			throw new CalException("次方為負值,結果回傳不為整數");

		} else if (x > 0 && y > 0) {
			System.out.println(x + "的" + y + "次方等於" + re);

		} else {
			throw new InputMismatchException("輸入格式不正確");
			

		}
	}
}
