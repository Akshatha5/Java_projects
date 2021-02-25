package Day10;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		System.out.println("current date "+dt);
		String dob="25-02-2021";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		Date db==sdf.parse(dob);

	}

}
