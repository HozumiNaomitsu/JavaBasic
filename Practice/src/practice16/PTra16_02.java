/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';

		int i = 1000;
		String strNum="2000";

		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
	Boolean bool = b;
	System.out.println(bool);
	
	Byte byte1 = by;  //new Byte(by);と同じ意味
	Short short1 = s; //new Short(s);同じ意味
	Character chara = c; //new Character(c);と同じ意味

	Integer i1 = new Integer(i);
	Integer i2 = Integer.valueOf(strNum);

	Long long1 = new Long(l);
	Float float1 = new Float (f);
	Double double1 = new Double(d);


	}
}
