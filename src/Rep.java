import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Rep {
    HashMap<String, Book> bookMap = new HashMap<>();
    HashMap<String, Author> authorMap = new HashMap<>();
    HashMap<String, List<Book>> author_book_pair = new HashMap<>();
        public String addBook(Book book){
        String name = book.getName();
        int noOfPage = book.getNoOfPages();
        Author a = book.getAuthor();
        double rating = book.getRating();

        Book b = new Book(name,noOfPage,a,rating);
        bookMap.put(name,b);
        if(!author_book_pair.containsKey(a)){
            List<Book> ls = new ArrayList<>();
            ls.add(b);
            author_book_pair.put(a.getName(), ls);
        } else {
            List<Book> ls = author_book_pair.get(a.getName());
            ls.add(b);
            author_book_pair.put(a.getName(),ls);
        }
        return "book added successfully";
    }
    //    get name of author who has written most number of pages
    public String getBookByName(){

    }


}
