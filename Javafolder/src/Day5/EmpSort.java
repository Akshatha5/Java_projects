package Day5;

import java.util.TreeSet;

import Day4.Employee;

public class EmpSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> empls=new TreeSet<>();
		empls.add(new Employee(201,"xyz",7000));
		empls.add(new Employee(101,"abc",5000));
		empls.add(new Employee(401,"ijk",8000));
		for(Employee e: empls) {
			System.out.println(e.getCode()+e.getName()+e.getSalary());
		}

	}

}
