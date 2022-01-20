import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter02 {
    public static void main(String[] args) {
        String data = "public class Test{ public static void main(String[] args){System.out.println(\"Hello!\");}}";
        int size = 1000;
        try (FileWriter fileWriter = new FileWriter("Test.java");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, size)) {
            bufferedWriter.write(data);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
