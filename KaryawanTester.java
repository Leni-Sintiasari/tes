//Driver Class
public class KaryawanTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        Karyawan a = new Karyawan(1, "ikhsan", "kurikulum", "Madura");
        Karyawan b = new Karyawan(2, "nadya", "BK", "Situbondo");
        Karyawan c = new Karyawan(3, "ita", "TU", "Bondowoso");
        Karyawan d = new Karyawan(4, "aqilla", "Kesiswaan", "Tulungagung");
        Karyawan e = new Karyawan(5, "yanto", "BK", "kediri");

        a.print();
        b.print();
        c.print();
        d.print();
        e.print();


    }
}