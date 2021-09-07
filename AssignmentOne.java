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
            System.out.println("Invalid Path, try again.");
        }
    }

    // Takes a directory path from the command line and prints the names of the files in the directory
    // If a subdirectory exists, prints the filenames and repeats for each subdirectory
    public static void main(String [] args) {
        Path dir = Paths.get(args[0]);
        
        listDirectory(dir);
    }
}