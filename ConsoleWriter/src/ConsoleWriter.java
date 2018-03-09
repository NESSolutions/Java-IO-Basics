//You must import java.io to perform I/O functions in your program.
import java.io.*;

public class ConsoleWriter {
	public static void main(String args[]) {
		String outputMSG = "Hello World!";
		
		//I/O classes throw an IOException error and must be placed in a try{} block.
		try {
			/*
			 * BufferedWriter takes an OutputStream as an argument. Use the
			 * OutputStreamWriter to specify the output destination which
			 * in this case is System.out which is mapped to the console.
			 */
			BufferedWriter bw = new BufferedWriter
					(new OutputStreamWriter(System.out));
			//BufferedWriter.write() allows you to place the data you want written.
			bw.write(outputMSG);
			//You must flush the data from the buffer before it will appear on the console.
			bw.flush();
		} catch(IOException e) {
			//The IOException error is thrown when the BufferedWriter or OutputStreamWriter
			//is unable to access the destination specified, in this case System.out.
			System.out.println("Error Writing Data");
		}
	}
}
