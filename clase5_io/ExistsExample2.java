package clase5_io;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class ExistsExample2 {

	
	public static void main(String... args) throws IOException {
        Path tempDirectory = Files.createTempDirectory("test-dir");
        Path path = Files.createTempFile(tempDirectory, "test-file", ".txt");
        //creating a symbolic link
        Path symbolicLink = Files.createSymbolicLink(path.getParent().resolve("sym-linked-file"), path);
        System.out.println("Sym file: " + symbolicLink);
        boolean exists = Files.exists(symbolicLink);
        System.out.println("Sym File exits: " + exists);
        //delete source
        Files.delete(path);
        //without any LinkOption
        boolean existsNow = Files.exists(symbolicLink);
        System.out.println("Sym file exits after deleting source file: " + existsNow);
        //with LinkOption.NOFOLLOW_LINKS
        boolean exitsNoFollowLink = Files.exists(symbolicLink, LinkOption.NOFOLLOW_LINKS);
        System.out.println("Sym file exits with NOFOLLOW_LINKS option: " + exitsNoFollowLink);
    }
}
