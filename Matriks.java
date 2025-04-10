import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi matriks 2x2
        int[][] X = new int[2][2];
        int[][] Y = new int[2][2];
        int[][] hasil = new int[2][2];

        // Input nilai untuk matriks X
        System.out.println("Masukkan elemen matriks X (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("X[" + i + "][" + j + "]: ");
                X[i][j] = input.nextInt();
            }
        }

        // Input nilai untuk matriks Y
        System.out.println("\nMasukkan elemen matriks Y (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Y[" + i + "][" + j + "]: ");
                Y[i][j] = input.nextInt();
            }
        }

        // Pilihan operasi menggunakan switch-case
        System.out.println("\nPilih operasi:");
        System.out.println("1. Pengurangan Matriks");
        System.out.println("2. Perkalian Matriks");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1: // Pengurangan Matriks
                System.out.println("\nHasil Pengurangan Matriks X - Y:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasil[i][j] = X[i][j] - Y[i][j];
                        System.out.print(hasil[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2: // Perkalian Matriks
                System.out.println("\nHasil Perkalian Matriks X * Y:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        hasil[i][j] = X[i][0] * Y[0][j] + X[i][1] * Y[1][j];
                        System.out.print(hasil[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
