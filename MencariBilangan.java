public class MencariBilangan {
    public static void main(String[] args) {
        // a. Bilangan prima antara 1-1000 menggunakan for-loop
        System.out.println("Bilangan Prima antara 1-1000:");
        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        // b. Bilangan ganjil antara 1-1000 menggunakan while-loop
        System.out.println("Bilangan Ganjil antara 1-1000 (Menggunakan while-loop):");
        int odd = 1;
        while (odd <= 1000) {
            System.out.print(odd + " ");
            odd += 2;  // Increment ke bilangan ganjil berikutnya
        }
        System.out.println("\n");

        // c. Bilangan genap antara 1-1000 menggunakan do-while loop
        System.out.println("Bilangan Genap antara 1-1000 (Menggunakan do-while loop):");
        int even = 2;
        do {
            System.out.print(even + " ");
            even += 2;  // Increment ke bilangan genap berikutnya
        } while (even <= 1000);
        System.out.println();
    }
}
