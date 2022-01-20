import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Reader11 {
    public static void main(String[] args)  {

        try ( PipedReader pr = new PipedReader();
                 PipedWriter pw = new PipedWriter(pr)) {
            Thread reader = new Thread(new Runnable(){
                public void run() {
                    try {
                        int data = pr.read();
                        while (data != -1) {
                            System.out.print((char) data);
                            data = pr.read();
                        }
                    } catch (Exception ex) {
                    }
                }
            });

            Thread writer = new Thread(new Runnable() {
                public void run() {
                    try {
                        pw.write("Hello\n".toCharArray());
                    } catch (Exception ex) {
                    }
                }
            });
            reader.start();
            writer.start();
            Thread.sleep(3000);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
