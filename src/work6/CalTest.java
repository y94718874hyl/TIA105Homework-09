package work6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		int x = 0, y = 0, re;
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();

		while (true)
			try {
				System.out.println("請輸入x的值");
				x = c.checkInt("x");
				System.out.println("請輸入y的值");
				y = c.checkInt("y");

				re = c.powerXY(x, y);
				if (x > 0 && y > 0) {
					System.out.println(x + "的" + y + "次方" + "等於" + re);
					break;
				}

			} catch (CalException e) {
				System.out.println(e.getMessage());
			}
	}
}