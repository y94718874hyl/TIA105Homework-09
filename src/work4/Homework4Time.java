package work4;

import java.util.Scanner;

public class Homework4Time {
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
	
	public static void main(String[] args) {

		int[][] mDay = { { 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 31, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
		Homework4Time re = new Homework4Time();

		Scanner sc = new Scanner(System.in);
		System.out.println("輸入西元年:");
		int year = sc.nextInt();
		System.out.println("請輸入月份:");
		int month = sc.nextInt();
		System.out.println("請輸入日:");
		int day = sc.nextInt();

		
		//日期錯誤篩選
		while ((year % 4 != 0) && (month == 2) && (day > 28)) {
			System.out.print("輸入錯誤,請重新輸入日");
			day = sc.nextInt();
			if (day <= 28) {
				break;
			}
		}
		while ((year % 4 == 0) && (month == 2) && (day > 29)) {
			System.out.print("輸入錯誤,請重新輸入日");
			day = sc.nextInt();
			if (day <= 29) {
				break;
			}
		}
		while ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& (day > 31)) {
			System.out.print("輸入錯誤,請重新輸入日");
			day = sc.nextInt();
			if (day <= 31) {
				break;
			}
		}
		while ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
			System.out.print("輸入錯誤,請重新輸入日");
			day = sc.nextInt();
			if (day <= 30) {
				break;
			}
		}

		int getDay = 0;
		for (int i1 = 0; i1 <= 0; i1++) {
			for (int j1 = 0; j1 < mDay[i1].length; j1++) {
				if (mDay[0][j1] < month) {
					getDay += mDay[1][j1];
				}
			}
		}
		if ((year % 4 == 0) && (month == 2) && (day == 29)) {
			getDay = getDay + day;
		} else if ((year % 4 != 0) && (month == 2) && (day == 28)) {
			getDay = getDay + day;
		} else if ((year % 4 == 0) && (month != 2)) {
			getDay = getDay + day + 29;
		} else if ((year % 4 != 0) && (month != 2)) {
			getDay = getDay + day;
		}
		System.out.println("輸入的日期為該年第" + getDay + "天");

	}

}