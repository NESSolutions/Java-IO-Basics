//You must import java.io to perform I/O functions in your program.
import java.io.*;

public class ConsoleReader {
	public static void main(String args[]) {
		//I/O classes throw an IOException error and must be placed in a try{} block.
		try {
			//Creates a new BufferedReader to read the characters from the console.
			BufferedReader br = new BufferedReader
					/*
					 * BufferedReader takes an InputStream as an argument. Use the 
					 * InputStreamReader to specify the source of the data to be read
					 * which in this case is System.in which is mapped to the keyboard.
					 */
					(new InputStreamReader(System.in));
			
			//BufferedReader.readLine() will read any keyboard input to the console when
			//the enter key is pressed on the keyboard. It will then by displayed.
			System.out.println(br.readLine());
		} catch(IOException e) {
			//The IOException error is thrown when the BufferedReader or InputStreamReader
			//is unable to access the source specified, in this case System.in.
			System.out.println("Error Reading Data");
		}
	}
}
