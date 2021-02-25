package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		list.add("aksh");
		list.add("deek");
		list.add("ashu");
		list.add("part");
		list.add("hard");
		Scanner sc=new Scanner(System.in);
		System.err.println("enter the name");
		String ch=sc.next();
		if (list.contains(ch)) {
			System.out.println("the name is present in the list");
		}
		else {
			System.out.println("the name is not present in the list");
		}
	}
}
