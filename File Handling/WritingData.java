package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\fileHandlingKolkata\\DarkKight";
        File directory = new File(path);

        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
                return;
            }
        }

        File file = new File(path + "\\output.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello from Kolkata!\n");
            writer.write("This is a sample text written to the file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
