import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new Map<String, Object>() {
            @Override
            public void clear() {}

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Set<Entry<String, Object>> entrySet() {
                return null;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Object put(String key, Object value) {
                
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Object> m) {
             

            }

            @Override
            public Object remove(Object key) {
                
                return null;
            }

            @Override
            public int size() {
               
                return 0;
            }

            @Override
            public Collection<Object> values() {
                return null;
            }
        };
    }
}