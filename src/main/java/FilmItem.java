public class FilmItem {
    private int id;
    private String genre;
    private String title;

    public FilmItem(int id, String genre, String title) {
        this.id = id;
        this.genre = genre;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
