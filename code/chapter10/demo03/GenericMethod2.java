public class GenericMethod2 {
    static <T extends GenericMethod2> void testGenericMethod(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }
    
    public static void main(String[] args) {
        GenericMethod2[] strArray = new GenericMethod2[]{
                new GenericMethod2(),
                new GenericMethod2()
            };
        testGenericMethod(strArray);
    }

    @Override
    public String toString() {
        return "GenericMethod2 toString()";
    }
}
