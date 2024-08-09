//Driver Class
public class SiswaTeaster {
    public static void main(String[] args) {
        //object
        //Class object = new Constructur
        Siswa leni = new Siswa();
        Siswa aveline = new Siswa();
        Siswa kalilah = new Siswa();
        Siswa memey = new Siswa();
        Siswa keyza = new Siswa();

        leni.id = 18;
        leni.nama = "leni sintiasari";
        leni.ipk = 90;

        aveline.id = 4;
        aveline.nama = "aveline voleta";
        aveline.ipk = 89;

        kalilah.id = 12;
        kalilah.nama = "kalilah arafah";
        kalilah.ipk = 90;

        memey.id = 31;
        memey.nama = "nur azlina";
        memey.ipk = 88;

        keyza.id = 14;
        keyza.nama = "keyza nadine";
        keyza.ipk = 89;

        System.out.println("id : " + leni.id);
        System.out.println("nama : " + leni.nama);
        System.out.println("ipk : " + leni.ipk);

        System.out.println("id : " + aveline.id);
        System.out.println("nama : " + aveline.nama);
        System.out.println("ipk : " + aveline.ipk);

        System.out.println("id : " + kalilah.id);
        System.out.println("nama : " + kalilah.nama);
        System.out.println("ipk : " + kalilah.ipk);

        System.out.println("id : " + memey.id);
        System.out.println("nama : " + memey.nama);
        System.out.println("ipk : " + memey.ipk);

        System.out.println("id : " + keyza.id);
        System.out.println("nama : " + keyza.nama);
        System.out.println("ipk : " + keyza.ipk);
    }
}
