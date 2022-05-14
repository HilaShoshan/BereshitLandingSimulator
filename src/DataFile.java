import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataFile {

    private String filename;
    private File fileobj;

    // constructor
    public DataFile(String filename) {
        this.filename = filename;
        try {
            fileobj = new java.io.File(filename);
            if (fileobj.createNewFile()) {
                System.out.println("File created: " + fileobj.getName());
            } else {
                fileobj.delete();  // clear the existing data on this file
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Creating file error.");
            e.printStackTrace();
        }
    }

    public boolean write(String data) {
        try {
            PrintWriter myWriter = new PrintWriter(new FileWriter(fileobj, true));
            myWriter.append(data);
            myWriter.close();
            System.out.println("Successfully append to the file.");
            return true;
        } catch (IOException e) {
            System.out.println("Writing file error.");
            return false;
        }
    }
}
