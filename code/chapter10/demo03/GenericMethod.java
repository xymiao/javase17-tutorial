public class GenericMethod {
    static <T> void testGenericMethod(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        String[] strArray = new String[]{"演示", "泛型方法", "看懂了吗？"};
        testGenericMethod(strArray);

        Integer[] intArray = new Integer[]{1, 2, 3};
        testGenericMethod(intArray);
    }
}
