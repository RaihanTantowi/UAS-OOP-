package DataMahasiswa;

public class Mahasiswa3 extends Person {

    public Mahasiswa3(String nama) {
        super.nama = nama;
    }

    @Override
    public void cetak() {
        System.out.println("Nama\t\t: "+getNama());
    }

}
