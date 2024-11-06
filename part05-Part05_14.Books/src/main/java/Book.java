
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object newBook) {
        if (this == newBook) {
            return true;
        }
        
        if (!(newBook instanceof Book)) {
            return false;
        }
        
        Book compareNewBook = (Book) newBook;
        
        if (this.name.equals(compareNewBook.getName()) && this.publicationYear == compareNewBook.getPublicationYear()) {
            return true;
        }
        
        return false;
    }

}
