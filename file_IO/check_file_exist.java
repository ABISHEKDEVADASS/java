

import java.io.File;

//checking file exist on mentioned loc
public class check_file_exist {

	public static void main(String[] args) {
		
	File f=new File("E:\\java\\test.txt");
	if(f.exists()) {
	System.out.print("presented at this loc");
	}
	else {
		System.out.print("not in that loc");
	}
	}

}