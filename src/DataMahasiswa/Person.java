package DataMahasiswa;

public abstract class Person {
    String nama;
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }
    public abstract void cetak();

}
