
public class Histori extends Library {
    private int volume;

    public Histori(String name, int year, String genre, int volume) {
        super(name, year, genre);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Объем: " + volume + " тома");
    }
}
