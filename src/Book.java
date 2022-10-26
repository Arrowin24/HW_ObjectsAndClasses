public class Book {
    private String name;
    private int year;
    private Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Реализация домашки по методам объекта
    @Override
    public String toString() {
        return "Book: " + name + ", year: "+year+", "  + author;
    }

    public boolean equals(Book book) {
        return (name == book.getName() && year == book.year&&author==book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,year,author);
    }
}
