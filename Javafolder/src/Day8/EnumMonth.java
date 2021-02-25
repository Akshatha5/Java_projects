package Day8;

import java.util.Scanner;

public class EnumMonth {
	public static void main(String[] args) {
		month mon=month.Feb;
	
		switch(mon) {
		case Jan :
		case Mar:
		case May:
		case Jul:
		case Aug:
		case Oct:
		case Dec:
			System.out.println("31 days");
			break;
		case Apr:
		case Jun:
		case Sep:
		case Nov:
			System.out.println("30 days");
			break;
		case Feb:
			System.out.println("28 days");	
			break;
		}
		
	}

}
