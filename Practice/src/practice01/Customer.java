package practice01;

public class Customer {

		String name;  //顧客の名前

		Wallet wallet;//財布

		void payment(Wallet wallet,int payment) {
			wallet.money-=payment;


		}
}

