package practice01;

public class Cat {

	
		String name; //猫の名前
		static String owner; //飼い主
		
		void getName() {
			System.out.println(Cat.owner+"の"+this.name);
			
		}
		static void setOwnerName(String name) {
			
			Cat.owner=name;
		}
}
