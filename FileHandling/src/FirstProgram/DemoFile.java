package FirstProgram;

import java.io.File;

public class DemoFile {
	public static void main(String[] args) {
		try {
			String path1 = "F:\\filesprogram\\input.txt";
			String path2 = "F:\\filesprogram\\output.txt";
			
			File file = new File(path1);
			
			System.out.println(file.exists());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getName());
			System.out.println(file.getParent());
			File file2 = new File(path2);
			System.out.println(file2.isDirectory());
			System.out.println(file2.isFile());
			System.out.println(file2.canExecute());
			System.out.println(file2.canRead());
			System.out.println(file2.canWrite());		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
