/**
 * 只是为了演示 javadoc 命令的使用
 * @author xymiao
 * @since 1.0
 */
public class Hello {
	/**
	 * Hello Java 程序的主运行函数
	 * @param args 接受参数
	 */
	public static void main(String[] args) {
		System.out.println("Hello 苗子说全栈!");
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}