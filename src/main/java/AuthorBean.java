import java.util.ArrayList;
import java.util.List;

public class AuthorBean {
    private long id;
    private String first_name;
    private String last_name;

    private List<QuotesBean> quotes;
    public AuthorBean() {
        this.quotes = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<QuotesBean> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<QuotesBean> quotes) {
        this.quotes = quotes;
    }


    public void addQuote(QuotesBean quote) {
        quotes.add(quote);
    }

}
