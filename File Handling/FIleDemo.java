package FileHandling;

import java.io.File;

public class FIleDemo {
	public static void main(String args[]) {
		String path="C:\\Users\\User\\Desktop\\fileHandlingKolkata\\test";
		String renamepath="C:\\Users\\User\\Desktop\\fileHandlingKolkata\\DarkKight";
		File file=new File(path);
		File file1=new File(renamepath);
		
		file.mkdir();
		file.mkdirs();
		
		file.renameTo(file1);
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
	}
}
