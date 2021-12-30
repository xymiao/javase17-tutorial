import java.lang.annotation.Documented;
import java.lang.annotation.Target;

/**
 * 测试 @Documented 注解
 */
@Documented
public @interface DocumentedTest {
    /**
     * 测试方法
     */
    void test();
}
