import java.io.FilterReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StringReader;

public class Reader06 {
    public static void main(String[] args) {

        try (Reader reader = new StringReader("0123456789\n");
                PushbackReader pushbackReader = new PushbackReader(reader);) {
            int count = 0;
            int i;
            while ((i = pushbackReader.read()) != -1) {
                System.out.print((char) i);
                if (count == 4) {
                    pushbackReader.unread('X');
                }
                count = count + 1;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
