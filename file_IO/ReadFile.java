package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        File f = new File("E:\\java\\text.txt");
        
        try {
        	Scanner read = new Scanner(f);
        	while(read.hasNextLine()) {
        		System.out.println(read.next());
        	}	
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
