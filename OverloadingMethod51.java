public class OverloadingMethod51 {
    // Method untuk menampilkan identitas mahasiswa
    public static void tampilkanIdentitas(String nama, String nim, String jurusan, String fakultas) {
        System.out.println("| Identitas Mahasiswa |");
        System.out.println("|---------------------|");
        System.out.println("| Nama    | " + nama + " |");
        System.out.println("| Nim     | " + nim + " |");
        System.out.println("| Jurusan | " + jurusan + " |");
        System.out.println("| Fakultas| " + fakultas + " |");
        System.out.println();
    }

    // Overloading method untuk menampilkan prestasi akademik
    public static void tampilkanIdentitas(String nama, double ipSemester, double ipKumulatif, String riwayatBeasiswa) {
        System.out.println("| Prestasi Akademik   |");
        System.out.println("|---------------------|");
        System.out.println("| Nama            | " + nama + " |");
        System.out.println("| IP Semester     | " + ipSemester + " |");
        System.out.println("| IP Kumulatif    | " + ipKumulatif + " |");
        System.out.println("| Riwayat Beasiswa| " + riwayatBeasiswa + " |");
        System.out.println();
    }

    // Method untuk menampilkan keduanya
    public static void tampilkanIdentitas(String nama, String nim, String jurusan, String fakultas, 
                                        double ipSemester, double ipKumulatif, String riwayatBeasiswa) {
        System.out.println("| Identitas Mahasiswa | Prestasi Akademik |");
        System.out.println("|---------------------|-------------------|");
        System.out.println("| Nama    | " + nama + " | Nama            | " + nama + " |");
        System.out.println("| Nim     | " + nim + " | IP Semester     | " + ipSemester + " |");
        System.out.println("| Jurusan | " + jurusan + " | IP Kumulatif    | " + ipKumulatif + " |");
        System.out.println("| Fakultas| " + fakultas + " | Riwayat Beasiswa| " + riwayatBeasiswa + " |");
        System.out.println();
    }

    public static void main(String[] args) {
        // Contoh penggunaan method overloading
        tampilkanIdentitas("Rafael", "123456789", "Informatika", "Fakultas Sains Teknologi dan Informasi");
        tampilkanIdentitas("Rafael", 3.75, 3.68, "Beasiswa Unggulan 2023");
        tampilkanIdentitas("Rafael", "123456789", "Informatika", "Fakultas sains dan teknologi", 
                          3.75, 3.68, "Tidak Pernah mendapatkan beasiswa");
    }
}