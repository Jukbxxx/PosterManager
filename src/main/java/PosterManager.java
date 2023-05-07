public class PosterManager {
    private FilmItem[] films = new FilmItem[0]; //поле для массива фильмов
    private int filmsAmount = 5; //поле для лимита по выводу последних добавленных фильмов

    public PosterManager(int filmsAmount) {
        this.filmsAmount = filmsAmount;
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
        int resultLength;
        if (films.length >= filmsAmount) {
            resultLength = filmsAmount;
        } else {
            resultLength = films.length;
        }
        FilmItem[] reversed = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;

    }

}
