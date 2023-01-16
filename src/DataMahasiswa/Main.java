package DataMahasiswa;

public class Main {
    public static void main(String[] args) {
      
        // membuat objek Person dari class Mahasiswa 1
        Person Mhsw1 = new Mahasiswa1("Raihan Tantowi");

        // membuat objek Person dari class Mahasiswa 2
        Person Mhsw2 = new Mahasiswa2("Doni Dermawan");
        
        // membuat objek Person dari class Mahasiswa 3
        Person Mhsw3 = new Mahasiswa3("Renza Kurnia");

        /* memanggil method cetak */
        System.out.println("============================================");
        System.out.println("\t\tData Mahasiswa");
        System.out.println("============================================");
        Mhsw1.cetak();
        System.out.println("Nim\t\t: 312110229");
        System.out.println("Universitas\t: Universitas Pelita Bangsa");
        System.out.println("Prodi\t\t: Teknik Informatika");
        System.out.println();
        Mhsw2.cetak();
        System.out.println("Nim\t\t: 312110228");
        System.out.println("Universitas\t: Universitas Singaperbangsa Karawang");
        System.out.println("Prodi\t\t: Ilmu Hukum\t");
        System.out.println();
        Mhsw3.cetak();
        System.out.println("Nim\t\t: 312110227");
        System.out.println("Universitas\t: Universitas Gajah Mada");
        System.out.println("Prodi\t\t: Management\t");
    }
}


