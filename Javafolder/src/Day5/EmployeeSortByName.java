package Day5;

import java.util.Comparator;

import Day4.Employee;

public class EmployeeSortByName implements Comparator<Employee> {

	public int compare(Employee emp1,Employee emp2) {
		int diff=emp1.getName().compareTo(emp2.getName());
		return diff;
		
	}
}
