public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //Реализация домашки по методам объекта
    @Override
    public String toString() {
        return "Author name: " + name + " " + surname;
    }

    public boolean equals(Author author) {
        return (name == author.getName() && surname == author.getSurname());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,surname);
    }
}
