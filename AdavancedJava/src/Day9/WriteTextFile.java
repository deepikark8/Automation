package Day9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		String systemDir = System.getProperty("user.dir");
		
		String fileSeparartor = System.getProperty("file.separator");				
		
		String sPath = systemDir+fileSeparartor+"File"+fileSeparartor+"WriteFile";
		
		System.out.println(sPath);
		
		BufferedWriter bufferWriter = null;
		try {
			FileWriter fileWriter = new FileWriter(sPath);
			bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.write("Nothing is impossible"+"\n");
			bufferWriter.write("Keep your face always toward the sunshine, and shadows will fall behind you."+"\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			bufferWriter.close();
		
		}
		

	}

}
