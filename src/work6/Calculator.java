package work6;

import java.util.Scanner;

public class Calculator {
	private int x;
	private int y;
	int re;

	public Calculator() {
	}

	public int powerXY(int x, int y) throws CalException {

		if (x == 0 || y == 0) {
			throw new CalException("0的0次方沒有意義");

		} else if (y < 0 || x < 0) {
			throw new CalException("次方為負值,結果回傳不為整數");

		} else if (x > 0 && y > 0) {
			int re = (int) Math.pow(x, y);
			return re;

		} else {
			throw new CalException("輸入格式不正確");
		}
	}

	public int checkInt(String data) {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("輸入格式不正確");
			System.out.println("請輸入" + data + "的值");
			sc.next();
		}
		return sc.nextInt();
		
//	排除x非數字,y同理
//		System.out.println("請輸入x的值");
//		if(!sc.hasNextInt()) {
//			System.out.println("輸入格式不正確");
//			sc.nextLine();
//			continue;
//		}else if (sc.hasNextInt()) {
//			x = sc.nextInt();
//		}
		
		
		//正則表達式(2025.01.22新增)
//		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
//		while (!input.matches("-?\\d+")) {
//			System.out.println("輸入格式不正確" + "\r\n" + "請輸入" + data + "的值");
//			input = sc.next();
//
//		}
//		return Integer.parseInt(input);
	}
}