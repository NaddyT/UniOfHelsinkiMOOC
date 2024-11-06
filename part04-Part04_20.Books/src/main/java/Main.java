import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            
            System.out.println("Title: ");
            String publication = scanner.nextLine();
            
            books.add(new Book(title, pages, publication));
        }
        
        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();
        if (info.contentEquals("everything")) {
            for (Book book : books){
                System.out.println(book.getName() + ", " + book.getPages() + ", " + book.getPublication());
            }
        } else if (info.contentEquals("name")) {
            for (Book book : books){
                System.out.println(book.getName());
            }
        }
        
    }
}
