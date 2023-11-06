public class First10Primes {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; count < 10; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
