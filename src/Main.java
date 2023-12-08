
public class Main {
    public static void main(String[] args) {
        Printable object2 = createObject(Janr.HORROR);
        Printable object3 = createObject(Janr.FANTASTIC);
        Printable object4 = createObject(Janr.HISTORY);
        Printable object5 = createObject(Janr.DETECTIVE);

        Printable[] books = {object2, object3, object4,object5};

        for (Printable book : books) {
            book.print();
            System.out.println("--------------------------------");
        }
    }

    public static Printable createObject(Janr janr) {
        switch (janr) {
            case DETECTIVE:
                return new Detective("История Шерлока Холмса", 2020, "Детектив", 400);
            case HORROR:
                return new Horror("Ужасные истории", 2005, "Ужастик", "Паркер");
            case FANTASTIC:
                String[] characters = {"Afrodita", "Zefs"};
                return new Fantastic("Иследование другой планеты", 2019, "Фантастика", characters);
            case HISTORY:
                return new Histori("История Кыргызкого народа", 2023, "История", 2);
            default:
                throw new IllegalArgumentException("Invalid Janr");
        }
    }
}
