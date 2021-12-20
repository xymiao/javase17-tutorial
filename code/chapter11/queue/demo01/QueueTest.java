import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class QueueTest {
    private static final class QueueImplementation implements Queue<String> {

        @Override
        public boolean add(String e) {
            
            return false;
        }

        @Override
        public String element() {
          
            return null;
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

        @Override
        public String remove() {
            return null;
        }

        @Override
        public boolean addAll(Collection<? extends String> c) {
            return false;
        }

        @Override
        public void clear() {
            
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public Object[] toArray() {
            return null;
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new QueueImplementation();
    }
}
