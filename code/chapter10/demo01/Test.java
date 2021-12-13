public class Test {
    public static void main(String[] args) {
        TestInterface<String> testInterface = new TestInterface<String>() {
            @Override
            public void add(String s) {
                System.out.println(s);
            }
        };
        testInterface.add("hello  Java interface Generic!");

        TestInterface<Integer> testInterface2 = new TestInterface<Integer>() {
            @Override
            public void add(Integer s) {
                System.out.println(s);
            }
        };
        testInterface2.add(10);
    }
}
