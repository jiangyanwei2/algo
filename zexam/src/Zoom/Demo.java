package Zoom;

import java.io.File;
import java.lang.reflect.Field;

public class Demo {
    public String a = "a";
    protected String b = "b";
    private  String c ="c";
    byte i = (byte)129;
    int j = 0123;



    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
       Class clazz = Demo.class;
        Field[] fields = clazz.getFields();
        Object obj = clazz.newInstance();
        for (Field field:fields) {
            System.out.println(field.getName()+"="+field.get(obj));

        }
    }
}
