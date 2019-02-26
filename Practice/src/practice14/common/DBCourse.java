package practice14.common;

public class DBCourse implements Course {

	
	public String getCourseName() {
		return  "『"+PREFIX+"DB基礎"+"』";
	}

	
	public String[] getCourseUnit() {
		String[]N=new String[4];
		N[0]="DB基礎";
		N[1]="SQL基礎";
		N[2]="正規化";
		N[3]="SQL応用";
		
		return N; 
	}
	 

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */



}
