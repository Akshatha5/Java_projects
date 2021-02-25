package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAppln {

public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Studentt> stdList=new ArrayList<>();
stdList.add(new Studentt(108,"pooja",40,60,50));
stdList.add(new Studentt(109,"swathi",40,20,60));
stdList.add(new Studentt(110,"shreya",52,45,35));
stdList.add(new Studentt(111,"disha",80,87,59));
stdList.add(new Studentt(112,"ashna",60,40,30));
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
String result;
int total;
float avg;
System.out.println("Enter the register number of student to know the result");
int refNo=sc.nextInt();
int I=-1;
int n=stdList.size();

try {
for(Studentt stud : stdList) {
I++;
if(stud.getRegno()==refNo) {
total=stud.getS1()+stud.getS2()+stud.getS3();
avg=(float)(total/3);
   if(stud.getS1()>=40 && stud.getS2()>=40 && stud.getS3()>=40)
   {
    result ="pass";
   }
   else
   {
    result = "fail";
   }
System.out.println("student has"+total);
System.out.println("student has"+avg);
System.out.println("student has"+result);
exit();
}
else if(I<n)
continue;
else
{
throw new StudentNotFoundException();
}
}
}
catch(StudentNotFoundException e) {
e.printStackTrace();

}
}

private static void exit() {
	// TODO Auto-generated method stub
	
}
}