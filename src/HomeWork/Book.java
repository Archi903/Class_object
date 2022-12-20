package HomeWork;

public class Book {
    private String nameBook;
    private String author;
    private int year;


    public Book(String nameBook, int age, String author) {
        this.nameBook = nameBook;
        this.year = age;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public int getYear() {
        return this.year;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setYear(int year) {
        this.year = year;
    }

}

