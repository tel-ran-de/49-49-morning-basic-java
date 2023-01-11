package lessons.lesson11;

public class BankAcc {
    public static void main(String[] args) {

        int N = 1001;
        int days = 0;

        while (N > 0) {
            days++;
            int maxDivisor = 1;
            for (int i = 2; i <= N / 2; i++) {
                if (N % i == 0 && i > maxDivisor) {

                    maxDivisor = i;
                }
            }
            N -= maxDivisor;
        }

        System.out.println("Days: " + days);
    }
}
