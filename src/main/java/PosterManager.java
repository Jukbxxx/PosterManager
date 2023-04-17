public class PosterManager {
    private FilmItem[] films = new FilmItem[0]; //поле для массива фильмов
    private int filmsAmount = 5; //поле для лимита по выводу последних добавленных фильмов

    public PosterManager(FilmItem[] films, int filmsAmount) {
        this.films = films;
        this.filmsAmount = filmsAmount;
    }

    public PosterManager(FilmItem[] films) {
        this.films = films;
    }

    public PosterManager() {

    }

    public void add(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmItem[] findAll() {
        return films;
    }

    public FilmItem[] findLast() {
        FilmItem[] films = findAll();
        FilmItem[] reversed = new FilmItem[filmsAmount];
        for (int i = 0; i < filmsAmount; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;

    }

}
