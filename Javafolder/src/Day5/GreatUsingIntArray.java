package Day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class GreatUsingIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {2,5,15,20,18};
		int max=Arrays.stream(x).max().getAsInt();
		System.out.println("the greatest number is"+max);

	}

}
