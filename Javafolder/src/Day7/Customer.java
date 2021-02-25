package Day7;

public class Customer {
	private int custno;
	private String name;
	private Address address;
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	public Customer() {

}
	public Customer(int custno, String name, Address adress) {
		super();
		this.custno = custno;
		this.name = name;
		this.address = adress;
	}
	public void setAddress(Address address) {
		// TODO Auto-generated method stub
		
	}
	public Address getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

}
