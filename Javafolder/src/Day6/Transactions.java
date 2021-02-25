package Day6;

import java.util.ArrayList;

public class Transactions {
	ArrayList<Account> acc=new ArrayList<>();
	public Transactions() {
		acc.add(new Account(101,"aksh",10000));
		acc.add(new Account(102,"gal",5000));
		acc.add(new Account(103,"Kar",15000));
	}
	public void create(String name,double amount)
	{   int max=0;
		for(Account a: acc)
		{
			if(a.getAcno()>max)
			{
				max=a.getAcno();
			}
			
		}
		acc.add(new Account(max+1,name,amount));
		System.out.println("Account is created successfully");
		System.out.println("Account Number : "+(max+1));
		System.out.println("Balance        : "+amount);
	}
	public void deposit(int accNo,double amount)
	{  boolean flag=false;
		for(Account a : acc)
		{
			if(a.getAcno()==accNo)
			{
		       a.setBalance(a.getBalance()+amount);
		       System.out.println("Amount has been deposited...Balance : "+a.getBalance());
		       flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("Account is not available...");
		}

	}
	public void withdraw(int accNo,double amount)
	{   boolean flag=false;
		for(Account a:acc)
		{
			if(a.getAcno()==accNo&&a.getBalance()>=amount)
			{
				a.setBalance(a.getBalance()-amount);
				System.out.println("Amount has been withdrawn...Balance : "+a.getBalance());
				flag=true;
			}
			else if(a.getAcno()==accNo&&a.getBalance()<amount)
			{
				System.out.println("Insufficient Balance");
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("Account is not available");
		}
	}
	public void checkBalance(int accNo)
	{   boolean flag=false;
		for(Account a:acc)
		{
			if(a.getAcno()==accNo)
			{
				System.out.println("Account balance is..."+a.getBalance());
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("Account is not available");
		}
	}
	public void viewAllAccount()
	{
		System.out.println("Number   Name     Balance");
		for(Account a : acc)
		{
			System.out.println(a.getAcno()+"    "+a.getCustName()+"    "+a.getBalance());
		}
	}

}