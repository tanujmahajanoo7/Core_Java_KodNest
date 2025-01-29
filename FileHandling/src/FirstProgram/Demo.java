package FirstProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		
//		try {
//			String path1 = "F:\\filesprogram\\input.txt";
//			String path2 = "F:\\filesprogram\\output.txt";
//			FileInputStream fis = new FileInputStream(path1);
//			FileOutputStream fos = new FileOutputStream(path2);
//			int x;
//			while((x = fis.read()) != -1) {
//				fos.write(x);
//			}
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//		}
				
//		try {	
//			String path1 = "F:\\filesprogram\\input.txt";
//			String path2 = "F:\\filesprogram\\output.txt";
//			FileReader fr = new FileReader(path1);
//			FileWriter fw = new FileWriter(path2);
//			int x;
//			while((x = fr.read()) != -1) {
//				fw.write(x);
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String path1 = "F:\\filesprogram\\input.txt";
//			String path2 = "F:\\filesprogram\\output.txt";
//			FileReader fr = new FileReader(path1);
//			FileWriter fw = new FileWriter(path2);
//			BufferedReader br = new BufferedReader(fr);
//			BufferedWriter bw = new BufferedWriter(fw);
//			String x;
//			while((x = br.readLine()) != null) {
//				bw.write(x);
//			}
//			bw.flush();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			String path1 = "F:\\filesprogram\\input.txt";
			String path2 = "F:\\filesprogram\\output.txt";
			
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
				
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String x;
			
			while((x = br.readLine())!=null) {
				bw.write(x);
			}
			bw.flush();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				br.close();
				bw.close();
				fr.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
