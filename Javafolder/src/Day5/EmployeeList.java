package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Day4.Employee;


public class EmployeeList {
	public static void main(String[] args) {
	ArrayList<Employee> empList= new ArrayList<>();
	empList.add(new Employee(101,"abc",5000));
	empList.add(new Employee(103,"xyz",7000));
	empList.add(new Employee(111,"ijk",6000));
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("\nSelect any option given below");
		System.out.println("1.Sort by Name\n2.Sort by Code\n3.Sort by Salary\n4.Exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
				Collections.sort(empList,new EmployeeSortByName());
				for(Employee emp : empList) 
					System.out.println("Emp code: "+emp.getCode()+" Name : "+emp.getName()+" Salary: "+emp.getSalary());
				break;
		case 2:
			Collections.sort(empList,new EmployeeSortByCode());
			for(Employee emp : empList) 
				System.out.println("Emp code: "+emp.getCode()+" Name : "+emp.getName()+" Salary: "+emp.getSalary());
			break;
		case 3 :
			Collections.sort(empList,new EmployeeSortBySalary());
			for(Employee emp : empList) 
				System.out.println("Emp code: "+emp.getCode()+" Name : "+emp.getName()+" Salary: "+emp.getSalary());
			break;
		case 4: System.out.println("Exiting...");
				System.exit(0);
		default : System.out.println("Invalid");
				break;
		}
	}
}
}
