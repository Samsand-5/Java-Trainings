package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {
	public static void main(String args[]) throws Exception{
		String destinationPath="C:\\Users\\User\\Desktop\\fileHandlingKolkata\\DannyDanials\\image.jpg";
		File destinationFile=new File(destinationPath);
		destinationFile.createNewFile();
		
		String sourcePath="C:\\Users\\User\\Pictures\\Saved Pictures\\a45b24553539079495f9a2ecd4a2fc6a.webp";
		File sourceFile=new File(sourcePath);
		
		FileInputStream fis=new FileInputStream(sourcePath);
		byte[] arr=new byte[(int)sourceFile.length()];
		
		fis.read(arr);
		
		FileOutputStream fos=new FileOutputStream(destinationFile);
		fos.write(arr);
		fis.close();
		fos.close();
	}
}
