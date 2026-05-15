import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f = new File("demo.txt");
        if (f.createNewFile()) {
            System.out.println("File Created");
        } else {
            System.out.println("File Already Exists");
        }
    }
}
