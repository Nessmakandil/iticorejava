/**
 * MainSubclass
 */
public class MainSubclass extends Main implements InterfaceTest{

    @Override
    public void test() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test'");
    }

    @Override
    public void testMethodAbstraction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testMethodAbstraction'");
    }

    @Override
    public void testDefaultMethod(){

    }

    public static void testStaticInteraction() {
        InterfaceTest.testStaticMethod();
    }
}