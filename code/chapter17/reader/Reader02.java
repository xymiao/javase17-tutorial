import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader02 {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("Reader01.java");
                BufferedReader bufferedReader = new BufferedReader(fileReader, 5000)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
