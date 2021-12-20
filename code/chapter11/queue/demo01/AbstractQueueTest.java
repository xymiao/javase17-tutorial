import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;

public class AbstractQueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new AbstractQueue<String>() {
            @Override
            public Iterator<String> iterator() {
                return null;
            }
    
            @Override
            public int size() {
                return 0;
            }
    
            @Override
            public boolean offer(String e) {
                return false;
            }
    
            @Override
            public String peek() {
                return null;
            }
    
            @Override
            public String poll() {
                return null;
            }
        };
    }
    
}
