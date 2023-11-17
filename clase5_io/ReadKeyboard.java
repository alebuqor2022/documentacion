package clase5_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadKeyboard {

	public static void main(String[] args) {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	
		String s;
		System.out.println("tipee algo, y presione CTRL-Z para salir");
		try {
			s=in.readLine();
			while(s !=null) {
				System.out.println("leo: " + s);
				s=in.readLine();
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
