public class Book {
//    name, noOfPage, author, rating
    private String name;
    private int noOfPages;
    private double rating;
    private Author author;

    public Book(String name, int noOfPages, Author author, double rating) {
        this.name = name;
        this.noOfPages = noOfPages;
        this.author = author;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
