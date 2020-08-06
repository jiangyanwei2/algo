package ClassLoader.ContextClassLoader;

import java.net.URL;
import java.net.URLClassLoader;

public class CustomClassloader extends URLClassLoader {

    public CustomClassloader(URL[] urls) {
        super(urls);
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        if (name.startsWith(" ClassLoader.ContextClassLoader")) {
            return findClass(name);
        }
        return super.loadClass(name, resolve);
    }
}
