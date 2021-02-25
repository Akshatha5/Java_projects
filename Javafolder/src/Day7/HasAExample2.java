package Day7;

import java.util.ArrayList;
import java.util.Scanner;

public class HasAExample2 {

	public static void main(String[] args) {
		ArrayList<Customer> cust=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {   Address add=new Address();
        	int no;
        	String name;
        	String street;
        	String city;
        	System.out.println("Enter Customer ID");
        	no=sc.nextInt();
        	System.out.println("Enter Customer Name");
        	name=sc.next();
        	System.out.println("Enter Customer Street");
        	street=sc.next();
        	System.out.println("Enter Customer City");
        	city=sc.next();
        	add.setStreet(street);
        	add.setCity(city);
        	cust.add(new Customer(no,name,add)); 	
        }
        cust.forEach((c)->{
        	System.out.println(c.getCustno()+" "+c.getName()+" "+c.getAdress().getStreet()+" "+c.getAddress());
        });

	}

}