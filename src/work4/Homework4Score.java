package work4;

import java.util.Arrays;

public class Homework4Score {

//班上有8位同學,他們進行了6次考試結果如下:計算出每位同學考最高分的次數
	
	public static void main(String[] args) {

		int[] st = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int max = 0;
		int re = 0;

		int[] count = new int[6];
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][j] > max) {
					max = test[i][j];
					re = st[j];

					count[i] = st[j];
				}
			}
			max = 0;
		}
		
		//每位同學考最高分次數
		int st1=0;
		int st2=0;
		int st3=0;
		int st4=0;
		int st5=0;
		int st6=0;
		int st7=0;
		int st8=0;
		
		for(int i=0;i<count.length;i++) {
			if(count[i]==1) {
				st1 += 1;
			}
			else if(count[i]==2) {
				st2 += 1;
			}
			else if(count[i]==3) {
				st3 += 1;
			}
			else if(count[i]==4) {
				st4 += 1;
			}
			else if(count[i]==5) {
				st5 += 1;
			}
			else if(count[i]==6) {
				st6 += 1;
			}
			else if(count[i]==7) {
				st7 += 1;
			}
			else if(count[i]==8) {
				st8 += 1;
			}
			
		}
		System.out.println("最高分次數:一號"+st1+"次;二號"+st2+"次;三號"+st3+"次;四號"+st4+"次");
		System.out.println("五號"+st5+"次;六號"+st6+"次;七號"+st7+"次;八號"+st8+"次");
	}

}


