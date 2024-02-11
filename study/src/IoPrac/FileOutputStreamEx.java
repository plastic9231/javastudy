package IoPrac;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c:/ddd/out.txt");
			
			String msg = "자바를 너무나 사랑합니다.";
			
			fos.write(msg.getBytes());
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				if(fos != null) {
					fos.close();
				}
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	}

}
