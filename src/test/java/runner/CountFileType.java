package runner;

import java.io.File;

public class CountFileType {

	public static final String PATH = "M:\\Question Bank";

	public static void main(String[] args) {

		countFileType();
	}

	private static void countFileType() {
		File files = new File(PATH);
		int pdf = 0, docx = 0, zip = 0, txt = 0, other = 0;
		;
		String[] list = files.list();
		for (String fName : list) {
			if (fName.endsWith(".pdf"))
				pdf++;
			else if (fName.endsWith(".docx"))
				docx++;
			else if (fName.endsWith(".txt"))
				txt++;
			else if (fName.endsWith(".zip"))
				zip++;
			else
				other++;
		}

		System.out.println("pdf\t= " + pdf);
		System.out.println("docx\t= " + docx);
		System.out.println("txt\t= " + txt);
		System.out.println("zip\t= " + zip);
		System.out.println("other\t= " + other);
	}

}
