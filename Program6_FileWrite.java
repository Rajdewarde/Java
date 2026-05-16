import java.io.FileWriter;
import java.io.IOException;

class Program6_FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello Java File Handling");
            fw.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
