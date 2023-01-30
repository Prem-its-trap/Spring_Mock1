
public class BookController {
    Rep repo = new Rep();
//    @PostMapping("book/add-book") // post mapping for adding the books

    public String addBook(Book book){
        return repo.addBook(book);
    }

//    get name of author who has written most number of pages
    public String getBookByName(){
        return repo.getBookByName();
    }
}
