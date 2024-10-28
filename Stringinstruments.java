package tugas2;

public class Stringinstruments extends instruments{
    private int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public Stringinstruments() {
        super();
        numStrings = 0;

    }

    public Stringinstruments(String name, double price, int numStrings) {
        super(name, price);
        this.numStrings = numStrings;
    }

    public void print() {
        super.print();
        System.out.println("numString: "+ numStrings);
    }
    
}
