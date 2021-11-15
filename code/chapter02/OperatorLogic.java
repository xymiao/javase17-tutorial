/**
 * 逻辑运算符
 */
public class OperatorLogic {
    public static void main(String[] args) {
        
        int type = 1;
        int delFlag = 1;

        //当 type 和 delFalg 都等于 1 的时候， 才能执行
        if( type == 1 && delFlag == 1){
            System.out.println("显示 type 等于 1 和 删除标志等于 1");
        }

        if(type == 1 || delFlag == 0){
            System.out.println("显示 type 等于 1 或 删除标志等于 0");
        }

        if(!(type == 1 )){
            System.out.println("显示 type 不等于 1 的内容");
        }
    }
}

