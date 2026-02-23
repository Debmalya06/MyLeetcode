class Solution {
    public double myPow(double x, int n) {
        // return find(x, (long) n);
        return Math.pow(x,n);
    }

    // private double find(double x, long n) {
    //     if (n == 0) {
    //         return 1;
    //     }
       
    //     if (n < 0) {
    //         return 1.0 / find(x, -n);
    //     }
       
    //     if (n % 2 == 1) {
    //         return x * find(x * x, (n - 1) / 2);
    //     } else {
    //         return find(x * x, n / 2);
    //     }
    // }
}