package tugas2;

public class Guitar extends Stringinstruments {
    private boolean isElectric;

    public boolean IsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public boolean isIsElectric() {
        return this.isElectric;

    }

    public Guitar(boolean isElectric, String name, double price, int numStrings) {
        super(name, price, numStrings);
        this.isElectric = isElectric;
    }

    public Guitar () {
        super();
        isElectric=false;
    }

    public void print() {
        super.print();
        System.out.println("Is Electric: " + isElectric);
    }

    }
        
    
