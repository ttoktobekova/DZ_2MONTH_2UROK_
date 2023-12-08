
public class Fantastic extends Library {
    private String[] characters;

    public Fantastic(String name, int year, String genre, String[] characters) {
        super(name, year, genre);
        this.characters = characters;
    }

    public String[] getCharacters() {
        return characters;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Персонажи: " + String.join(", ", characters));
    }
}
