package Day8;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObjectFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fos = new FileInputStream("d:\\febjee\\cardinfo.txt\\");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Object obj;
		while((obj=oos.readObject())!= null) {
			CardDetails card=(CardDetails) obj;
			System.out.println(card.getCardno()+" "+card.getName()+" "+card.getExpmon()+" "+card.getExpyear()+" "+card.getCvv());
		}
		oos.close();
		fos.close();
		}catch(IOException | ClassNotFoundException e){
			//e.printStackTrace();
		}

	}

}
