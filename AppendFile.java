import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt", true);
        fw.write("\nNew Data Added");
        fw.close();
        System.out.println("Data Appended");
    }
}
