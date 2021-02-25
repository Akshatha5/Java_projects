package Day8;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


public class ReadDataFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("d:\\febjee");
		try {
			FileInputStream fos=new FileInputStream (file+"\\sample.txt");
			int c;
			while((c=fos.read()) != -1)
				System.out.println((char)c);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
