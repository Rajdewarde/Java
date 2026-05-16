import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Program9_BufferedReader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
