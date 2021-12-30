import java.lang.annotation.Documented;

/**
 * 测试没有 @Documented 注解情况
 */
public @interface DocumentedNoTest {
    /**
     * 测试方法
     */
    void test();
}
