import java.lang.Math;
public class Method {
    static int N = 4;
    static double fact;
    public static double factorial(int N) {
        double result = 1;
        if (N == 1 || N == 0) {
            return result;
        }
            result = N * factorial(N - 1);
            return result;
    }
    public static double log(){
         fact = Math.log(factorial(N));
         return fact;
    }
}
