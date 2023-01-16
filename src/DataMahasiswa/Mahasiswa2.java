package DataMahasiswa;

public class Mahasiswa2 extends Person {

    public Mahasiswa2(String nama) {
        super.nama = nama;
     
    }
    @Override
    public void cetak() {
        System.out.println("Nama\t\t: "+getNama());
    
    }
      
}