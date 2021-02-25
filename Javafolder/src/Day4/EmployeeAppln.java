package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(new Employee(10,"akshatha",5000));
		empList.add(new Employee(11,"abcd",10000));
		for(Employee emp : empList)
			System.out.println(emp.getCode()+" "+emp.getName()+" "+emp.getSalary());
		Scanner sc=new Scanner(System.in);
		for(int i =0;i<3;i++) {
			System.out.println("Enter employee details");
			int empcode=sc.nextInt();
			String name=sc.next();
			double salary=sc.nextDouble();
			empList.add(new Employee(empcode,name,salary));
		}
		for(Employee emp : empList)
			System.out.println(emp.getCode()+" "+emp.getName()+" "+emp.getSalary());
	}

}