import java.io.*;
class RenameFile{
	public static void main(String args[]){
		File f1=new File("path");
		File f2=new File("path2");
		boolean b=f1.renameTo(f2);
		System.out.println("Renamed : "+b);
	}
	
}