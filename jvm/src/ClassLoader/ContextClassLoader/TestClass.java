package ClassLoader.ContextClassLoader;

public class TestClass {
    public void test() throws Exception{
        Class clazz = Thread.currentThread().getContextClassLoader().loadClass("ClassLoader.ContextClassLoader.Person");
        Person person = (Person) clazz.newInstance();
        System.out.print(person.getClass().getClassLoader());

    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        try {
            testClass.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
