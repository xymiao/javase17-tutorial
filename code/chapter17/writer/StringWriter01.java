import java.io.StringWriter;

public class StringWriter01 {
    public static void main(String[] args) {
        try (StringWriter stringWriter = new StringWriter()) {
            String str = "苗子";
            stringWriter.write(str);
            stringWriter.append(',');
            CharSequence cs = "说全栈之 Java 篇。";
            stringWriter.append(cs);

            StringBuffer stringBuffer = stringWriter.getBuffer();
            System.out.println(stringBuffer);

            int i = 'A';
            stringWriter.write(i);
            System.out.println(stringWriter);

            String str2 = "Java I/O";
            stringWriter.write(str2, 0, 4);
            System.out.println(stringWriter);

            char [] c = {'A','C','V','K','O'};
            stringWriter.write(c);
            System.out.println(stringWriter);

            stringWriter.write(c, 1, 2);
            System.out.println(stringWriter);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
