import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class HitungLuas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Input keliling lingkaran menggunakan Scanner
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = scanner.nextDouble();
        double kelilingLingkaran = 2 * Math.PI * r;
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
        
        try {
            // Input luas trapesium menggunakan BufferedReader
            System.out.print("Masukkan panjang sisi atas trapesium: ");
            double atas = Double.parseDouble(reader.readLine());
            System.out.print("Masukkan panjang sisi bawah trapesium: ");
            double bawah = Double.parseDouble(reader.readLine());
            System.out.print("Masukkan tinggi trapesium: ");
            double tinggi = Double.parseDouble(reader.readLine());
            
            double luasTrapesium = 0.5 * (atas + bawah) * tinggi;
            System.out.println("Luas trapesium: " + luasTrapesium);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memasukkan data.");
        }
        
        // Input luas prisma segitiga menggunakan JOptionPane
        try {
            double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga: "));
            double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga: "));
            double tinggiPrisma = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi prisma: "));
            
            double luasSegitiga = 0.5 * alas * tinggiSegitiga;
            double luasPrisma = luasSegitiga * tinggiPrisma;
            
            JOptionPane.showMessageDialog(null, "Luas prisma segitiga: " + luasPrisma);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memasukkan data.");
        }
        
        scanner.close();
    }
}
