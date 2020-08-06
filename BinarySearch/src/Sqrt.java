public class Sqrt {
    public static double sqrt(double num, double precise) {
        double left = 0;
        double right = num;
        double mid = 0;
        double prec = precise == 0 ? 1e-7 : precise;
        while (right - left > prec) {
            mid = left + (right - left) / 2;
            double square = mid * mid;
            if (square <= num) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        double res = sqrt(1, 0);
        System.out.println(res);
    }
}
