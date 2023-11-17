package clase5_io;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

public class BuscarCurrentPath {

	public static void main(String[] args) {
		 String userDirectory = System.getProperty("user.dir");
         System.out.println(userDirectory);
         
          userDirectory = new File("").getAbsolutePath();
          System.out.println(userDirectory);
         
          
          userDirectory = FileSystems.getDefault()
        	        .getPath("")
        	        .toAbsolutePath()
        	        .toString();
          System.out.println(userDirectory);
          
          userDirectory = Paths.get("")
        	        .toAbsolutePath()
        	        .toString();
          System.out.println(userDirectory);
	}

}
