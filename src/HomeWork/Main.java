package HomeWork;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Кэти", "Сьерра");
        Book book1 = new Book("Java", 2012);
        System.out.println("author1.firstName = " + author1.getFirstName());
        System.out.println("author1.secondName = " + author1.getSecondName());
        System.out.println("book1.nameBook = " + book1.getNameBook());
        System.out.println("book1.age = " + book1.getYear());


        book1.setYear(2002);
        System.out.println("book1 = " + book1.getYear());

        Author author2 = new Author("Лев", "Толстой");
        Book book2 = new Book("Война и мир", 1873);
        System.out.println("Автор книги №2 = " + author2.getFirstName() + " " + author2.getSecondName());
        System.out.println("Название и год книги №2 = " + book2.getNameBook() + " " + book2.getYear());
    }
}
