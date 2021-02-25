package Day8;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("d:\\febjee\\cardinfo.txt\\");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			CardDetails card1=new CardDetails (123456987521123L,"capgemini",10,22,345);
			CardDetails card2=new CardDetails (854136655521123L,"adnan khan",11,24,125);
			oos.writeObject(card1);
			oos.writeObject(card2);
			oos.close();
			fos.close();
			System.out.println("created");
		
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
