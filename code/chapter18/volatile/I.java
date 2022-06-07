public class I {
    int i;
    void test(){
        synchronized(this){
            i++;
        }
    }

    void add(){
        i = i + 1;
    }
}
