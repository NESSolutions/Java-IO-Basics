import java.io.*;

public class FileWriter {
	public static void main(String args[]) {
		String outputMSG = "HelloWorld!";
		
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			for(int i = 0; i < outputMSG.length(); i++) {
				fos.write(outputMSG.charAt(i));
			}
		} catch(IOException e) {
			System.out.println("Error Writing To File");
		}
	}
}
