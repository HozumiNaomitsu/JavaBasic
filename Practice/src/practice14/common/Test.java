package practice14.common;

public class Test {
	 public static void main(String[] args) {


		 JavaCourse JC = new JavaCourse();
		 System.out.println(JC.getCourseName());
		 //全部だしたいなら
		 String[] list = JC.getCourseUnit();
		 for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		 //1つ出したいなら
		 System.out.println(JC.getCourseUnit()[1]);

		 
		 DBCourse DB = new DBCourse();
		 System.out.println(DB.getCourseName());
		 
		 System.out.println(DB.getCourseUnit()[2]);
		 
		 String[]lists=DB.getCourseUnit();
		 for(int i=0;i<lists.length;i++ ) {
			 System.out.println(lists[i]);
		 }
		 
		 
		 
		 
		 
	 }


}
