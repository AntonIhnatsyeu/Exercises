import java.lang.Math;
public class Method {
    static int N = 4;
    static double fact;
    public static double Log(int N) {
        double result = 1;
        if (N == 1 || N == 0) {
            return result;
        } else
            result = N * Log(N - 1);
            return result;
    }
    public static double Fact(){
         fact = Math.log(Log(N));
         return fact;
    }
}
