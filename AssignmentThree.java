import java.io.FileReader;

public class AssignmentThree {

    // Takes a textfile name followed by a character on the command line
    // Counts the number of times the character appears in the file.
    public static void main(String [] args) {
        String filename = args[0];
        char c = args[1].charAt(0);

        int sum = 0;
        try {
            FileReader f = new FileReader(filename);
            char character;

            while((character = (char)f.read()) != -1) {
                if(character == c) {
                    sum++;
                }
            }

            f.close();

            System.out.println("The number of times the character "+args[1]+" appeared in the file was: "+sum);

        } catch(Exception e){
            System.err.print(e);
        }
    }
    
}
