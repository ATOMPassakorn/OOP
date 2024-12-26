public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    public void addBook(Book book, int slot){
        if(slot==1){
            book1=book;
        }else if(slot==2){
            book2=book;
        }else{
            book3=book;
        }
    }
    public void removeBook(int slot){
        if(slot==1){
            book1=null;
        }else if(slot==2){
            book2=null;
        }else{
            book3=null;
        }
    }
    public void printLibraryDetails(){
        System.out.println("Library: "+libraryName);
        System.out.println("");
        printBookDetails(book1);
        printBookDetails(book2);
        printBookDetails(book3);
    }
    public void checkBookAvailability(int slot){
        if (slot == 1 && book1 != null) {
            System.out.println(book1.title + " is available.");
        } else if (slot == 2 && book2 != null) {
            System.out.println(book2.title + " is available.");
        } else if (slot == 3 && book3 != null) {
            System.out.println(book3.title + " is available.");
        } else {
            System.out.println("Book in slot " + slot + " is not available.");
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        if (slot == 1 && book1 != null) {
            book1.price = newPrice;
            System.out.println("Updated price of " + book1.title + " to $" + newPrice + ".");
        } else if (slot == 2 && book2 != null) {
            book2.price = newPrice;
            System.out.println("Updated price of " + book2.title + " to $" + newPrice + ".");
        } else if (slot == 3 && book3 != null) {
            book3.price = newPrice;
            System.out.println("Updated price of " + book3.title + " to $" + newPrice + ".");
        } else {
            System.out.println("No book in this slot.");
        }
    }
    public void printBookDetails(Book book){
        if (book != null) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("Price: $" + book.price);
            System.out.println("Available: " + (book.isAvailable ? "Yes" : "No"));
            System.out.println();
        } else {
            System.out.println("No book in this slot.");
            System.out.println("");
        }
    }
}
