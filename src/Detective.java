public class Detective extends Library implements Printable{
    private  int countPage;

    public Detective(String name, int age, String janr, int countPage) {
        super(name, age, janr);
        this.countPage = countPage;
    }

    public int getCountPage() {
        return countPage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( " Количество страницы: "  + countPage+"\n--------------------------------");
    }
}
