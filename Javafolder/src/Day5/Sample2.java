package Day5;

interface Arithmetic{
	void add(int x,int y);
}
interface Params{
	String output(String name);
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleInterface sample= ( ) -> {
			System.out.println("thi is a functonl interface");
		};
		sample.hello();
		sample.display();
		SampleInterface.output();
		Arithmetic add=(x,y)->{
			System.out.println(x+y);
		};
		add.add(5, 6);
		Params p=(name)->{
			return "Hello"+name;
		};
		System.out.println(p.output("capgemini"));

	}

}
