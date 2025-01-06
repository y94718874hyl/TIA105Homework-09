package work4;

import java.util.Arrays;

public class Homework4 {
	public static void main(String[] args) {

//有個一維陣列如下:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] n = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int avg = 0;
		for (int i = 0; i < n.length; i++)
			avg += n[i];
		avg = avg / n.length;
		System.out.println("平均值是" + avg);
		System.out.print("大於平均值的數有");

		for (int j = 0; j < n.length; j++) {
			if (n[j] > avg) {
				System.out.print(n[j] + " ");
			}
		}
		System.out.println();

//請建立一個字串,經過程式執行後,輸入結果是反過來的例如String s = “Hello World”,執行結果即為dlroW olleH

		String[] s = { "H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d" };
		for (int i = s.length - 1; i < s.length && i >= 0; i--) {
			System.out.print(s[i]);
		}

//有個字串陣列如下 (八大行星):{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)	

		String[] star = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length(); j++) {
				switch (star[i].charAt(j)) {
				case 'a':
					count += 1;
					break;
				case 'e':
					count += 1;
					break;
				case 'i':
					count += 1;
					break;
				case 'o':
					count += 1;
					break;
				case 'u':
					count += 1;
					break;
				default:
					break;
				}
			}
		}
		System.out.print(count);
	}
}
