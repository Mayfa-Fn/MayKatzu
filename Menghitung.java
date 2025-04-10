import java.util.Scanner;       // Untuk Scanner
import java.io.*;               // Untuk BufferedReader
import javax.swing.*;           // Untuk JOptionPane

public class Menghitung {  // Nama kelas harus sesuai dengan nama file
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // **1. Keliling Lingkaran (Menggunakan Scanner)**
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble();
        double kelilingLingkaran = 2 * Math.PI * radius;
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        // **2. Luas Trapesium (Menggunakan BufferedReader)**
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMasukkan panjang sisi atas trapesium: ");
        double atas = Double.parseDouble(br.readLine());
        System.out.print("Masukkan panjang sisi bawah trapesium: ");
        double bawah = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tinggi trapesium: ");
        double tinggiTrapesium = Double.parseDouble(br.readLine());
        double luasTrapesium = 0.5 * (atas + bawah) * tinggiTrapesium;
        System.out.println("Luas Trapesium: " + luasTrapesium);

        // **3. Luas Prisma Segitiga (Menggunakan JOptionPane)**
        double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang alas segitiga:"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        double tinggiPrisma = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi prisma:"));
        
        double luasPrisma = (2 * (0.5 * alas * tinggiSegitiga)) + (3 * alas * tinggiPrisma);
        JOptionPane.showMessageDialog(null, "Luas Prisma Segitiga: " + luasPrisma);

        // Tutup Scanner
        scanner.close();
    }
}
