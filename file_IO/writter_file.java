package file;
import java.io.*;
import java.util.Scanner;

public class writter_file  {
	public static void main(String args[]) { 
		
	try {
		FileWriter f_w = new FileWriter("E:\\java\\test.txt");
		f_w.write("hi");
		f_w.write("hi");
		f_w.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
		 
	}

}
