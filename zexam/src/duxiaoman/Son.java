package duxiaoman;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Son extends Father {
    public Son(int x) {
        System.out.println("b" + x);
    }

    private void addShort() {
        Set<Short> set = new TreeSet<Short>();
        for (Short i = 0; i < 20; i++) {
            set.add(i);
            set.remove(i - 1);
        }
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        new Son(2).addShort();
    }
}
