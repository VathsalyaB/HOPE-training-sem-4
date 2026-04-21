import java.io.*;
public class FileReaderImplementation {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("hope_batch_1.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
