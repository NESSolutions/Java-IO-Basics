import java.io.*;

public class FileReader {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			
			int i = fis.read();
			while(i != -1) {
				System.out.print((char) i);
				i = fis.read();
			}
		} catch(IOException e) {
			System.out.println("Error Reading File" + e);
		}
	}
}
