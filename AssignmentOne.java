import java.io.File;
import java.nio.file.*;

public class AssignmentOne {


    public static void listDirectory(Path p) {
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(p)) {
            for (Path a: stream) {
                File f = a.toFile();
                if(f.isDirectory()) {
                    System.out.println(a.getFileName());
                    listDirectory(a);
                } else {
                    System.out.println(a.getFileName());
                }
            }
        } catch (Exception e) {
            System.err.print(e);
        }
    }


    public static void main(String [] args) {
        Path dir = Paths.get("C:/Users/Matthew/Documents");
        
        listDirectory(dir);
    }
}