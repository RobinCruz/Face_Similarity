import java.lang.*;
import java.util.*; 
import java.io.*;
public class P2J {

   public static void main(String []args) {
	try{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		String path = String.format("python face_similarity_api.py %s %s %s", str1, str2,str3);
		Process p = Runtime.getRuntime().exec(path);
		}
	catch(IOException e){
		e.printStackTrace();
	}
   }
}