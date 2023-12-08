
public class Library implements Printable {
    private String name;
    private int year;
    private String genre;

    public Library(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void print() {
        System.out.println("Название: " + name + "\nГод выпуска: " + year + "\nЖанр: " + genre);
    }
}
