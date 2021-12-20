import java.util.Set;
import java.util.TreeSet;

public class TreeSet2Test {
    public static void main(String[] args) {
        Set<MenuInfo> set = new TreeSet<>();
        MenuInfo menuInfo = null;
        for (int i = 100; i < 103; i++) {
            menuInfo = new MenuInfo(String.valueOf(i), String.valueOf(i));
            set.add(menuInfo);
            System.out.print(menuInfo);
        }
        System.out.println();
        for (int i = 20; i < 23; i++) {
            menuInfo = new MenuInfo(String.valueOf(i), String.valueOf(i));
            set.add(menuInfo);
            System.out.print(menuInfo);
        }
        System.out.println();
        for (int i = 200; i < 203; i++) {
            menuInfo = new MenuInfo(String.valueOf(i), String.valueOf(i));
            set.add(menuInfo);
            System.out.print(menuInfo);
        }
        System.out.println();
        for (MenuInfo mi : set) {
            System.out.print(mi);
        }
        System.out.println();
    }
}
class MenuInfo implements Comparable<MenuInfo>{
    private String id;
    private String name;
    public MenuInfo(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "MenuInfo [id=" + id + ", name=" + name + "]";
    }
    @Override
    public int compareTo(MenuInfo o) {
        if(this.id.equals(o.id)){return 0;}
        int i = Integer.parseInt(this.id) >  Integer.parseInt(o.id) ? 1 : -1 ;
        return i;
    }
}
