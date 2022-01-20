import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter03 {
    public static void main(String[] args) {
        String data = "第一行数据";
        String data2 = "第二行数据";

        try (FileWriter fileWriter = new FileWriter("Test.java");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.write(data2);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
