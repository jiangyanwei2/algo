package String;

public class KMP {
    public static void getNext(String pattern, int[] next) {
        int len = pattern.length();
        int j = 0;
        int k = -1;
        next[0] = -1;
        while(j < len - 1) {
            if ( k == -1 || pattern.charAt(k) == pattern.charAt(j)) {
                j++;
                k++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
    }

    public static int kmp(String str, String pattern) {
        int i = 0;
        int j = 0;
        int[] next = new int[pattern.length()];
        getNext(pattern, next);
        while (i < str.length() && j < pattern.length()) {
            if (j == -1 || str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == pattern.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String pattern = "ababaaaba";
        int [] next = new int[pattern.length()];
        getNext(pattern, next);
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + " ");
        }
        String str = "aaababaaaba";
        System.out.println(kmp(str, pattern));

    }
}
