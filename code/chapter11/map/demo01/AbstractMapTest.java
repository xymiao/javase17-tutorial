import java.util.AbstractMap;
import java.util.Set;

public class AbstractMapTest {
    private static final class AbstractMapExtension extends AbstractMap {

        @Override
        public Set entrySet() {
            
            return null;
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new AbstractMapExtension();
    }
    
}
