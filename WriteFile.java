import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("Hello Java File Handling");
        fw.close();
        System.out.println("Data Written Successfully");
    }
}
