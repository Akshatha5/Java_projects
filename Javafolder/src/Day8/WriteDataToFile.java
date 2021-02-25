package Day8;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("d:\\febjee");
		try {
			FileOutputStream fos=new FileOutputStream (file+"\\sample.txt");
			for (char c='A';c<='Z';c++)
				fos.write(c);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");

	}

}
