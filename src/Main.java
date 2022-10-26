public class Main {
    public static void main(String[] args) {
        Author ruAuthor = new Author("Dmitriy", "Dunaev");
        Author enAuthor = new Author("James", "Johns");
        Book ruBook = new Book("Astronavt",1985,ruAuthor);
        Book enBook = new Book("Deep",1998, enAuthor);
        printBook(ruBook);
        ruBook.setYear(2005);
        System.out.println("New book year: "+ruBook.getYear());

        //Реализация домашки по методам объекта
        System.out.println("\nПроверка домашнего задания на методы объектов");
        Author ruAuthorCopy = new Author("Dmitriy", "Dunaev");
        Book ruBookCopy = new Book("Astronavt",2005,ruAuthor);
        System.out.println("Проверка метода toString:");
        System.out.println(ruBookCopy);
        System.out.println(ruAuthorCopy);
        System.out.println("Проверка метода equals:");
        System.out.println(ruBookCopy.equals(ruBook));
        System.out.println(ruBook.equals(enBook));
        System.out.println("Проверка метода hashCode:");
        System.out.println(ruBook.hashCode());
        System.out.println(ruBookCopy.hashCode());



    }

    public static void printBook(Book book){
        System.out.println("Book: "+book.getName());
        System.out.println("Author: "+book.getAuthor().getSurname()+" "+book.getAuthor().getName());
        System.out.println("Publication year: "+book.getYear());
    }
}