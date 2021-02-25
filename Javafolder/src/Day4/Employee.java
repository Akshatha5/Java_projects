package Day4;


public class Employee implements Comparable<Employee>{
	private int code;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String name;
	private double salary;
	public Employee() {
		
	}
	public Employee(int code,String name,double salary) {
		this.code=code;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//int diff=this.code-o.getCode();
		//int diff=this.name.compareTo(o.getName());
		double diff=this.salary-o.getSalary();
		//return diff;
		return (int) diff;
	}

}
