public interface InterfaceTest {

    void test();
    default void testDefaultMethod() {}
    static void testStaticMethod() {}
}