//Constructor parameter
public class Karyawan {
   //variable = parameter
    int id;
    String nama;
    String unit;
    String alamat;

    public Karyawan(int id, String nama, String unit, String alamat) {
    this.id = id;
    this.nama = nama;
    this.unit = unit;
    this.alamat = alamat;

    }

    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Unit: " + unit);
        System.out.println("Alamat: " + alamat);
    }
}

