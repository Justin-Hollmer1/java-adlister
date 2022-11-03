import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        AlbumBean album = new AlbumBean();
        AuthorBean author = new AuthorBean();
        QuotesBean quote = new QuotesBean();

        author.setId(1);
        author.setFirst_name("AuthorFirstName");
        author.setLast_name("AuthorLastName");


        // Adding the quote.
        quote.setId(1);
        quote.setContent("THIS IS THE CONTENT OF THE QUOTE");
        quote.setAuthor(author);
//        quote.getAuthor().addQuote(quote);
        author.addQuote(quote);
        // Adding the quote.


        System.out.println("This is the author of the quote: ");
        System.out.println(quote.getAuthor().getId());
        System.out.println("This is the quote: ");
        System.out.println(quote.getContent());

        System.out.println("This is the list of the quotes for the first author: ");
        System.out.println(author.getQuotes().get(0).getContent());

    }
}
