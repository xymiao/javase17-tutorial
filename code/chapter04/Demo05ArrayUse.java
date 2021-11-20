
public class Demo05ArrayUse {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        //如何知道数组的长度
        for(int i = 0; i < arrayInt.length; i ++){
            arrayInt[i] = i;
        }
        System.out.println("数组的长度是：" + arrayInt.length);
        
        //类似这个
        int length = Demo05ArrayUse.length;
        System.out.println(length);
    }
    public static int length = 0;
}
