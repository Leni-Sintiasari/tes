package tugas2;

public class Taster {
    public static void main(String[] args) {
        //array variabel
        int[] nilai = new int[10];
        nilai[0] = 10;
        nilai[3] = 50;

        int[] n = {1, 2, 3, 4, 5 };
        System.out.println(n[0]);
        System.out.println(n[4]);
        for (int i = 0; i <n.length; i++){
            System.out.println(n[i]);
        }

        String[] nama = {"keja", "inel", "lila", "aveline"};
        for (int j = 0; j<nama.length; j++){
            System.out.println(nama[j]);
        }

        
    }
    
}
