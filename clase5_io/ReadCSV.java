package clase5_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadCSV {

	public static void main(String[] args) {
		String s;
		 try {
			FileInputStream fs= new FileInputStream("c:\\Ale\\datos.csv");
			DataInputStream ds=new DataInputStream(fs);
			
			while(true) { // recorre las filas
				s=ds.readLine();
				if(s==null)break;
				StringTokenizer st= new StringTokenizer(s, ";");
				//System.out.println("tokens: " + st.countTokens());
				int cols=st.countTokens();
				for(int i=0; i<cols;i++) { // recorre las columnas
					System.out.print(st.nextToken()+ " ");
				}
				System.out.println();
			}
			fs.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
