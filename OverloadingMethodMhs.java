public class OverloadingMethodMhs {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private Double ipSemester;
    private Double ipKumulatif;

    // Method untuk menampilkan identitas dasar
    public void tampilkanData(String nama, String nim, String jurusan, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        
        System.out.println("| Identitas Mahasiswa |");
        System.out.println("|---------------------|");
        System.out.println("| Nama    | " + this.nama + " |");
        System.out.println("| Nim     | " + this.nim + " |");
        System.out.println("| Jurusan | " + this.jurusan + " |");
        System.out.println("| Fakultas| " + this.fakultas + " |");
        System.out.println();
    }

    // Overloading method untuk menampilkan lengkap dengan IP
    public void tampilkanData(String nama, String nim, String jurusan, String fakultas, 
                            double ipSemester, double ipKumulatif) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
        
        System.out.println("| Identitas Mahasiswa |");
        System.out.println("|---------------------|");
        System.out.println("| Nama        | " + this.nama + " |");
        System.out.println("| Nim         | " + this.nim + " |");
        System.out.println("| Jurusan     | " + this.jurusan + " |");
        System.out.println("| Fakultas    | " + this.fakultas + " |");
        System.out.println("| IP Semester | " + this.ipSemester + " |");
        System.out.println("| IP Kumulatif| " + this.ipKumulatif + " |");
        System.out.println();
    }

    public static void main(String[] args) {
        OverloadingMethodMhs mhs = new OverloadingMethodMhs();
        
        // Contoh penggunaan method overloading
        mhs.tampilkanData("Ian", "1122334455", "Infromatika", "FSTI");
        
        mhs.tampilkanData("Myan", "5566778899", "Sastra komputer", "FS", 3.75, 3.68);
    }
}