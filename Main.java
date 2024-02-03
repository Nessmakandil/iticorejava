public abstract class Main {

    // public abstract void test();
    public abstract void testMethodAbstraction();

    public static void main(String[] args) {
        InterfaceTest.testStaticMethod();
        InterfaceTest obj = new InterfaceTest() {

            @Override
            public void test() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'test'");
            }
            
        };
        
    }
}