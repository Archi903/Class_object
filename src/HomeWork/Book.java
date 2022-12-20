package HomeWork;

public class Book {
    private String nameBook;
    private int year;


    public Book(String nameBook, int age) {
        this.nameBook = nameBook;
        this.year = age;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

