package chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1127 {
    public static void main(String[] args) {
        StdOut.println(binomial(100, 50, 0.25,0));
    }

    public static double binomial(int N, int k, double p,int depth) {
        System.out.println(depth);
        if (N == 0 && k == 0) {
            return 1.0;
        }

        if (N < 0 || k < 0) {
            return 0;
        }

        return (1.0 - p) * binomial(N - 1, k, p,depth++) + p * binomial(N - 1, k - 1, p,depth++);
    }
}
