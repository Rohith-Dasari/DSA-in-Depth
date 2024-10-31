public class EulerTotient{
    public static int ETF(int n) {
        int phi_n = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                phi_n -= phi_n / i; 
            }
        }
        if (n > 1) {
            phi_n -= phi_n / n; 
        }
        return phi_n; 
    }

    public static void main(String[] args) {
        int n = 115; 
        int result = ETF(n);
        System.out.println("integers in range 1 to "+ n + "that are co-prime to" + n + " is: " + result);
    }
}

