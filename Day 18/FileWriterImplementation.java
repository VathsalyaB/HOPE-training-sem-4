import java.io.FileWriter;
public class FileWriterImplementation {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hope_batch_1.txt");
            writer.write("Welcome to File Handling in Java!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
