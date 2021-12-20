import java.util.AbstractCollection;
import java.util.Iterator;

public class AbstractCollectionTest {
    public static void main(String[] args) {
        Test test = new Test();
    }
}
class Test extends AbstractCollection<String>{
   
    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

}
