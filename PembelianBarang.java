import java.util.Scanner;

public class PembelianBarang {
    public static void main(String[] args) {
       double total, diskon, pothar;

       Scanner input = new Scanner(System.in);
       System.out.println("masukkan total pembelian: ");
       total = input.nextDouble();
       
       if (total > 150000) {
           pothar =0;
           diskon =0.1 * total;
           total-= diskon;
       } else {
        diskon = 0;
        pothar = 5000;
        total -= pothar;
       }

       System.out.println("Diskon: " + diskon);
       System.out.println("Potongan Harga: "+pothar);
       System.out.println("Total yang harus dibayarkan: " + total);
    }
}
