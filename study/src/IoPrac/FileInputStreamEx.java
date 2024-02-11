package IoPrac;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		
		FileInputStream fis = null;

		byte[]_read = new byte[1000];
		byte[] console = new byte[1000];
		
		try {
			System.out.print("파일명 : ");
			System.in.read(console);
			String file = new String(console).trim();
			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.println(new String(_read).trim());
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
	}

}
