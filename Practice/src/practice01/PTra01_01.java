package practice01;
/*
 * PTra01_01.java
 *   作成 LIKEIT  2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra01_01 {
    public static void main(String[] args) {

    	
    	Cat.setOwnerName("hosumi");
    	System.out.println(Cat.owner);
    	
    	
    	Cat cat1 = new Cat();
    	Cat cat2 = new Cat();
    	
    	Cat.owner="穂積尚光";
    	cat1.name="ミケ";
    	cat2.name="たま";
    	
    	cat1.getName();
    	cat2.getName();
    	
    	
    	
    	Wallet wallet = new Wallet();
    	wallet.money = 1000;

    	Customer customer=new Customer();
    	customer.payment(wallet,100);

    	

    	System.out.println("財布の中身は"+wallet.money+"円");




        // ★このJavaプログラムを変更して、「Welcome!Java」と出力（コマンドプロンプトに表示）してください
        System.out.println("Welcome!java");

    }
}
