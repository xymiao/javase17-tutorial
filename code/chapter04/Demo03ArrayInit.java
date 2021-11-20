public class Demo03ArrayInit {
    public static void main(String[] args) {
        byte[] arrayByte = new byte[]{};
        System.out.println("byte: ");
        for (byte i : arrayByte) {
            System.out.print(i + " ");
        }

        System.out.println("\nshort:");
        short[] arrayShort = new short[5];
        for (short i : arrayShort) {
            System.out.print(i + " ");
        }

        System.out.println("\nint: ");
        int[] arrayInt = new int[5];
        for (int i : arrayInt) {
            System.out.print(i + " ");
        }

        System.out.println("\nlong: ");
        long[] arrayLong = new long[5];
        for (long i : arrayLong) {
            System.out.print(i + " ");
        }

        System.out.println("\nfloat: ");
        float[] arrayFloat = new float[5];
        for (float i : arrayFloat) {
            System.out.print(i + " ");
        }

        System.out.println("\ndouble: ");
        double[] arrayDouble = new double[5];
        for (double i : arrayDouble) {
            System.out.print(i + " ");
        }

        System.out.println("\nboolean: ");
        boolean[] arrayBoolean = new boolean[5];
        for (boolean i : arrayBoolean) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nchar: ");
        char[] arrayChar = new char[5];
        for (char i : arrayChar) {
            System.out.print((byte)i + " ");
        }

        System.out.println("\nString: ");
        String[] arrayString = new String[5];
        for (String i : arrayString) {
            System.out.print(i + " ");
        }

        System.out.println("\nDemo03ArrayInit: ");
        Demo03ArrayInit[] arrayDemo03ArrayInit = new Demo03ArrayInit[5];
        for (Demo03ArrayInit i : arrayDemo03ArrayInit) {
            System.out.print(i + " ");
        }
    }
}
