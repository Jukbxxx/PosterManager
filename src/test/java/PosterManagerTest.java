import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterManager poster = new PosterManager();


    FilmItem film1 = new FilmItem(1, "боевик", "Бладшот");
    FilmItem film2 = new FilmItem(32, "мультфильм", "Вперёд");
    FilmItem film3 = new FilmItem(13, "комедия", "Отель Белград");
    FilmItem film4 = new FilmItem(48, "боевик", "Джентльмены");
    FilmItem film5 = new FilmItem(9, "ужасы", "Человек-невидимка");
    FilmItem film6 = new FilmItem(57, "мультфильм", "Тролли. Мировой тур");
    FilmItem film7 = new FilmItem(14, "комедия", "Номер один");
    ;


    @BeforeEach
    public void setup() {
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);
        poster.add(film6);
        poster.add(film7);
    }

    @Test
    public void shouldSaveNewFilm() {
        FilmItem film8 = new FilmItem(63, "мультфильм", "Кот в сапогах");
        poster.add(film8);
        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8};
        FilmItem[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReverseLastFilmsIfEqualsAmount() {
        PosterManager poster = new PosterManager();
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);
        FilmItem[] expected = {film5, film4, film3, film2, film1};
        FilmItem[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLastFilmsIfLess() {
        PosterManager poster = new PosterManager();
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        FilmItem[] expected = {film3, film2, film1};
        FilmItem[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLastFilmsIfMore() {
        FilmItem[] expected = {film7, film6, film5, film4, film3};
        FilmItem[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLastFilmsIfChangedAmount() {
        PosterManager poster = new PosterManager(2);
        poster.add(film3);
        poster.add(film6);
        poster.add(film5);
        FilmItem[] expected = {film5, film6};
        FilmItem[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}




