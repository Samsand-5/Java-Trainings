package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSWWrite {
	public static void main(String args[]) throws Exception {
		String path="C:\\\\Users\\\\User\\\\Desktop\\\\fileHandlingKolkata\\\\DannyDanials\\text.csv";
		File file=new File(path);
		file.createNewFile();
		
		try (FileWriter writer=new FileWriter(file)){
			writer.append("id,name,age\n");
			writer.append("1,Soumyodip,22\n");
			writer.append("2,Shuvam,22\n");
			writer.append("3,Samriddhi,22\n");
			
			System.out.println("CSV file written successfully");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
