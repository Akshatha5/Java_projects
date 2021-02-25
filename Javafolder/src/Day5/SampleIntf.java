package Day5;

public interface SampleIntf {
	void display();
	default void output(){
		System.out.println("this is ");
	}

}
