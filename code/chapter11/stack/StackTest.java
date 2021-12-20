import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("存入数据!");
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
            stack.push(String.valueOf(i));
        }
        System.out.println(stack);
        
        System.out.print("查看栈顶的数据: ");
        System.out.println(stack.peek());

        int index = stack.search("3");
        System.out.println("数据的位置为: " + index);
        System.out.println("根据下标获得数据: " + stack.get(stack.size() - index));

        stack.pop(); // 先取出来一次。
        System.out.print("取出栈顶的数据: ");
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
            if(stack.empty()){
                System.out.println("堆栈中没有数据了");
                break;
            }
            System.out.println(stack.pop());
            System.out.print("显示当前数据: ");
            System.out.println(stack);
        }
         
    }

}
