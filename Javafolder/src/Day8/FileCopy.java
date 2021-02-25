package Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("d:\\febjee");
		try {
			FileInputStream fis=new FileInputStream (file+"\\sample.txt");
			FileOutputStream fnew=new FileOutputStream (file+"\\new.txt");
			int c;
			while((c=fis.read()) != -1)
				fnew.write(c);
			    System.out.println("success");
			
			fis.close();
			fnew.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}


	}

}
