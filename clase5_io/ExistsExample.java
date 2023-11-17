package clase5_io;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExistsExample {

	
	public static void main(String... args) throws IOException {
        Path path = Files.createTempFile("test-file", ".txt");
        System.out.println("File to check: " + path);
        boolean exists = Files.exists(path);
        System.out.println("File to check exits: " + exists);
        //delete
        Files.delete(path);
        boolean existsNow = Files.exists(path);
        System.out.println("File exits after deleting: " + existsNow);

    }
}
