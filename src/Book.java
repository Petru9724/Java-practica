public class Book {
   //Atributele clasei
    String title;
    String author;
    int numberPages;

    // Constructorul
    public Book(String titleBook, String authorBook, int numberPagesBook) {
        this.title = titleBook;
        this.author = authorBook;
        this.numberPages = numberPagesBook;
    }
     //Metoda de afisare
    void infoBook() {
        System.out.println("Title of book :" + title + ", Author of the book : " + author + ", Number page of the book " + numberPages);
    }
      // Metoda main
    public static void main(String[] args) {

        // Am creiat 2 obiecte
        Book a1 = new Book("Tema pentru acasa", "Nicolae Dabija", 50);
        Book a2 = new Book("Ana Blandiana", " Cineva", 80);

        a1.infoBook();
        a2.infoBook();
    }



}