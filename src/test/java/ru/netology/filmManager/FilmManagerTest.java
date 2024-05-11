package ru.netology.filmManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test

    public void testFilmManagerWithoutAddingMovie() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testFilmManagerAddingThreeMovie() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testDisplayingMoviesReverseOrder() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");

        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testDisplayingMoviesReverseOrder1() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testDisplayingMoviesReverseOrder2() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void testDisplayingMoviesReverseOrder3() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie 1");
        manager.addFilm("Movie 2");
        manager.addFilm("Movie 3");
        manager.addFilm("Movie 4");
        manager.addFilm("Movie 5");
        manager.addFilm("Movie 6");
        manager.addFilm("Movie 7");



        String[] expected = {"Movie 7","Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
