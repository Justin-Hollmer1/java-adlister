public class AlbumBean {
    private long id;
    private String artist;
    private String name;
    private int release_date;
    private float sales;
    private String genre;

    public AlbumBean() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getRelease_date() {
        return release_date;
    }
    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSales() {
        return sales;
    }
    public void setSales(float sales) {
        this.sales = sales;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}