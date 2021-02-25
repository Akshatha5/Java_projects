package Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CountVowelsFile {
	public static void main(String[] args) {
		File file=new File("d:\\febjee");
		file.mkdir();
		int voC = 0;
		int Coc=0;
		try {
			FileInputStream fis = new FileInputStream (file+"\\sample.txt");
			int c;
			while((c=fis.read()) != -1)
				if(c=='A'|c=='E'|c=='O'|c=='I'|c=='U') {
					voC++;
				}else {
					Coc++;}
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("numbers of vowels are "+voC);
		System.out.println("numbers of consonantss are "+Coc);	
		

	}

}
