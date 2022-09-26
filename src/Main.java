public class Main {
    public static void main(String[] args) {
        Author ruAuthor = new Author("Dmitriy", "Dunaev");
        Author enAuthor = new Author("James", "Johns");
        Book ruBook = new Book("Astronavt",1985,ruAuthor);
        Book enBook = new Book("Deep",1998, enAuthor);
        printBook(ruBook);
        ruBook.setYear(2005);
        System.out.println("New book year: "+ruBook.getYear());

    }

    public static void printBook(Book book){
        System.out.println("Book: "+book.getName());
        System.out.println("Author: "+book.getAuthor().getSurname()+" "+book.getAuthor().getName());
        System.out.println("Publication year: "+book.getYear());
    }
}