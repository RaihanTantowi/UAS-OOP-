package DataMahasiswa;

public class Mahasiswa1 extends Person {

    public Mahasiswa1(String nama) {
        super.nama = nama;
    
    }

    @Override
    public void cetak() {
        System.out.println("Nama\t\t: "+getNama());
    }

  
}
