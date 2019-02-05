package practice10;
/*
 * PTra10_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_02 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください


		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください


		// ★ 変数usに格納されているインスタンスのuserIdフィールドに、101を代入してください


		// ★ 変数usに格納されているインスタンスのuserNmフィールドに、"リゾーム太郎"を代入してください


		// ★ 変数usに格納されているインスタンスのmailフィールドに、"rhizome@hoge.com"を代入してください


		// ★ 変数usに格納されているインスタンスのpasswordフィールドに、"1qazxcv"を代入してください


		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		User us;
		us = new User();
		
		us.userId=101;
		us.userNm="リゾーム太郎";
		us.mail="rhizome@hoge.com";
		us.password="1qazxcy";
		
		
		System.out.println(us.userId);
		System.out.println(us.userNm);
		System.out.println(us.mail);
		System.out.println(us.password);

	}
}
