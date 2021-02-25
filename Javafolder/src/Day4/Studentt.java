package Day4;
public class Studentt {
	protected int regno;
	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public int getS3() {
		return s3;
	}

	public void setS3(int s3) {
		this.s3 = s3;
	}

	protected String name;
	protected int s1;
	protected int s2;
	protected int s3;
	protected int total;
	

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Studentt(int regno, String name, int s1, int s2, int s3) {
		super();
		this.regno = regno;
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		
	}

	
}