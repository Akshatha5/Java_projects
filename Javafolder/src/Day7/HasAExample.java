package Day7;

public class HasAExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust=new Customer();
		cust.setCustno(1234);
		cust.setName("capgemini");
		Address address=new Address();
		address.setStreet("KSR road");
		address.setCity("mangalore");
		cust.setAddress(address);
		System.out.println(cust.getCustno()+" "+cust.getName()+" "+cust.getAddress()+" "+cust.getAddress());
		System.out.println(address.getStreet()+" "+address.getCity());

	}

}
