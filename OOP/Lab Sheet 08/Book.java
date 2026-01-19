public class Book {
    private String isbn;
    private String title;
    private Library library;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public void setLibrary(Library lib) {
        this.library = lib;
    }

    public void displayBookDetails() {
        System.out.println("ISBN : " + isbn);
        System.out.println("Title : " + title);
        if (library != null) {
            System.out.println("Library : " + library);
        } else {
            System.out.println("This book is not belongs to a library");
        }
    }
}

class Library {
    private String libraryName;
    private int bookCount = 0;
    Book [] books = new Book [3];

    public Library (String libraryName){
        this.libraryName = libraryName;
    }

    public void addBook(Book book){
        if (bookCount < 3){
            books [bookCount] = book;
            book.setLibrary(this);
            bookCount ++;
        }
        else{
            System.out.print("Book limit is Exceeded");
        }
    }

    public void displayLibraryDetails(){
        System.out.println("Name of the library :" +libraryName);
        System.out.println("Book Details :");

        for (int i=0; i<bookCount; i++){
            books[i].displayBookDetails();
            System.out.println(" ");
        }
    }
}

class LibraryApp {
    public static void main (String [] args){
        Library library = new Library("Test Library");

        Book book1 = new Book("123", "No regrets");
        Book book2 = new Book ("456", "Chemistry of love" );
        Book book3 = new Book ("789", "Diganawa");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayLibraryDetails();
    }
}
