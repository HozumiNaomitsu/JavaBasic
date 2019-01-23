package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
	
		int a=(array[0][0]+array[0][1]+array[0][2]);
		int b=(array[1][0]+array[1][1]+array[1][2]+array[1][3]);
		
		System.out.println(a/3);
		System.out.println(b/4);
		System.out.println((a+b)/7);
		
		int sum=0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				sum += array[i][j];
			}
		}
		System.out.println(sum/7);
		
		}
		
		
		}
		
	

