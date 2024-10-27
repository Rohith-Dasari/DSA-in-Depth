class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieveOfEratosthenes(300);
    }

    static void sieveOfEratosthenes(int n) {
        if (n < 2) {
            return;
        }
        // Create a boolean array to mark prime or non-prime, considering only odd numbers as all even numbers except '2' are composite
        boolean[] isPrime = new boolean[(n / 2) + 1]; 
        // Start by marking all odd numbers as prime
        for (int i = 1; i <= n / 2; i++) {
            isPrime[i] = true; 
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (isPrime[i / 2]) {
                // Mark multiples of the current prime
                for (int multiple = i * i; multiple <= n; multiple += 2 * i) {
                    isPrime[multiple / 2] = false;
                }
            }
        }

        // Print the prime numbers
        System.out.print("Prime numbers up to " + n + ": 2 ");
        for (int i = 3; i <= n; i += 2) {
            if (isPrime[i / 2]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
