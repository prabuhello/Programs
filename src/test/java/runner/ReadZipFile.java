package runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadZipFile {
    public static void main(String[] args) {
        // Specify the path to the zip file you want to read
        String zipFilePath = "M:/Question Bank.zip";

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry;
            	int pdf=0, txt=0, docx =0, other=0;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                // Print the name of the entry (file or directory)
                 String name = entry.getName();
                 	if(name.endsWith(".pdf"))
                 		pdf++;
                 	else
                 		other++;
            }
            System.out.println("Pdf "+pdf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

