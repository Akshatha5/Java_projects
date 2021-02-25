package Day5;


import java.util.Comparator;

import Day4.Employee;

public class EmployeeSortByCode implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int diff=o1.getCode()-o2.getCode();
		return diff;
	}
	

}