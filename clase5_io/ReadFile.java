package clase5_io;
import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
		File file=new File("c:\\Ale\\","hola.txt");
		System.out.println(file.length());

		try {
			// aca, aplico el patron DECORATOR
			BufferedReader in=new BufferedReader(new FileReader(file));
			String s=in.readLine();
			while(s !=null) {
				System.out.println("veo: " + s);
				s=in.readLine();
			}
			in.close();			
			
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
