package Day6;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Transactions tran=new Transactions();
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		while(!flag) {
		System.out.println("Enter the option ");
		String type=sc.next();
		int accN;
		double amnt;
		String name;
		switch(type)
		{  
		   case  "create":
		   {
			   System.out.println("Enter your name and amount to deposit");
			   name=sc.next();
			   amnt=sc.nextDouble();
			   tran.create(name, amnt);
			   break;
		   }
		   case "deposit":
		   {
			   System.out.println("Enter the account number and ammount to deposit");
			   accN=sc.nextInt();
			   amnt=sc.nextDouble();
			   tran.deposit(accN, amnt);
			   break;
		   }
		   case "withdraw":
		   {
			   System.out.println("Enter the account number and ammount to withdraw");
			   accN=sc.nextInt();
			   amnt=sc.nextDouble();
			   tran.withdraw(accN, amnt);
			   break;
		   }
		   case "check":
		   {
			   System.out.println("Enter the account number to check balance");
			   accN=sc.nextInt();
			   tran.checkBalance(accN);
			   break;
		   }
		   case "view":
		   {
			   tran.viewAllAccount();
			   break;
		   }
		   case "exit":
		   {
			   flag=true;
			   break;
		   }
		
		}
		}
	}
}
	