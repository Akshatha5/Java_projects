package Day5;
import java.util.ArrayList;
import java.util.Scanner;
import Day4.Employee;

public class EmployeeList1 {
	public static void main(String[] args) {
				ArrayList<Employee> emplist=new ArrayList<>();
				emplist.add(new Employee(920,"xbc",5490));
				emplist.add(new Employee(509,"ska",2389));
				emplist.add(new Employee(228,"ksh",9000));
				emplist.add(new Employee(781,"wou",7800));
				Scanner scl=new Scanner(System.in);
				System.err.println("enter type of sorting");
				String type=scl.next();
				switch(type) {
				case "code":
				    emplist.sort((Employee o1,Employee o2)->o1.getCode()-o2.getCode());
				    emplist.forEach((e)->
		            System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
				    break;
				case "salary":
				    emplist.sort((Employee o1,Employee o2)->(int) (o1.getSalary()-o2.getSalary()));
			        emplist.forEach((e)->
		            System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
			        break;
				case "name":
				emplist.sort((Employee o1,Employee o2)->(o1.getName().compareTo(o2.getName())));
				emplist.forEach((e)->
		       System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
				break;
				}	
	}
}
