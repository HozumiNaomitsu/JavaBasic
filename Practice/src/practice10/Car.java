package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;
101	
	User us;
	us = new User();
	
	System.out.println(us.userId);
	System.out.println(us.userNm);
	System.out.println(us.mail);
	System.out.println(us.password);
102
	
103
	User us;
	us=new User();

	java.util.Scanner
	scanner=new java.util.Scanner(System.in);
	String line = scanner.nextLine();

	String[] array = line.split(",");



	us.userId=Integer.parseInt(array[0]);
	us.userNm=array[1];
	us.mail=array[2];
	us.password=array[3];

	System.out.println(us.userId);
	System.out.println(us.userNm);
	System.out.println(us.mail);
	System.out.println(us.password);
