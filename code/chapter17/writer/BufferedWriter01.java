import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter01 {
    public static void main(String[] args) {
        String data = "public class Test{ public static void main(String[] args){System.out.println(\"Hello!\");}}";

        try (FileWriter fileWriter = new FileWriter("Test.java");
                BufferedWriter output = new BufferedWriter(fileWriter)) {
            output.write(data);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
