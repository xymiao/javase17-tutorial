public class TestClass<T> {
    public void add(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        TestClass<String> testClass = new TestClass<>();
        testClass.add("hello Java class Generic!");

        TestClass<Integer> testClass2 = new TestClass<>();
        testClass2.add(10);
    }
}
