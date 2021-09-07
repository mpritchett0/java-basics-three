import java.io.FileWriter;


public class AssignmentTwo {

    // Takes a text filename from the commandline, and appends any other command line arguments to the file
    public static void main(String [] args) {
        String filename = args[0];

        try {
            FileWriter w = new FileWriter(filename, true);
            w.write("\n");
            w.write("This statement was appended to the text file");
            w.write("\n");
            for(int i = 1; i<args.length; i++) {
                w.write(args[i]+" ");
            }

            w.close();
        } catch(Exception e){
            System.err.print(e);
        }
        


    }
    
}
