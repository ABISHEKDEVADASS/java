

import java.io.File;
import java.io.IOException;
//creating new file
public class create_file {

	public static void main(String[] args) {
		File f=new File("E:\\java\\test.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
