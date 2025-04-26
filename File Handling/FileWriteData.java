package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteData {
	public static void main(String args[]) throws IOException {
		String path="C:\\Users\\User\\Desktop\\fileHandlingKolkata\\DarkKight\\output.txt";
		
		File file=new File(path);
		FileOutputStream fos=new FileOutputStream(file,true);
		
		String message="Would you like to have Mutton Biriyani";
		
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(int i=0;i<message.length();i++) {
			fw.write(message.charAt(i));
		}
		
		bw.flush();
		bw.close();
		fw.close();
	}
}
