import java.io.FileWriter;
import java.io.IOException;

class Program8_FileAppend {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt", true);
            fw.write("\nAppending new data");
            fw.close();

            System.out.println("Data appended successfully");
        } catch (IOException e) {
            System.out.println("Error appending file");
        }
    }
}
