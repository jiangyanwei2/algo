package ClassLoader.ContextClassLoader;

import java.lang.reflect.Method;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws Exception {
        URL url[] = new URL[1];
        url[0] = Thread.currentThread().getContextClassLoader().getResource("");
        final CustomClassloader customClassloader = new CustomClassloader(url);
        Thread.currentThread().setContextClassLoader(customClassloader);
        Class clazz = customClassloader.loadClass("ClassLoader.ContextClassLoader.TestClass");
        Object object = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("test");
        method.invoke(object);
    }


}
