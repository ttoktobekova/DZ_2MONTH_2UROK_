
public class Horror extends Library {
    private String subgenre;
    private String author;

    public Horror(String name, int year, String subgenre, String author) {
        super(name, year, "Ужасы");
        this.subgenre = subgenre;
        this.author = author;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Поджанр: " + subgenre + "\nАвтор: " + author);
    }
}
