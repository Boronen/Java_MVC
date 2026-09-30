package mvc_film;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filmek {

    private ArrayList<Film> filmek_lista;

    public Filmek() {
        filmek_lista = new ArrayList<>();

        filmek_lista.add(new Film("The Shawshank Redemption", 1994, 9.3));
        filmek_lista.add(new Film("A keresztapa", 1972, 9.2));
        filmek_lista.add(new Film("The Dark Knight", 2008, 9.0));
        filmek_lista.add(new Film("Amélie", 2001, 8.3));
        filmek_lista.add(new Film("七人の侍", 1954, 8.6));
        filmek_lista.add(new Film("Parasite", 2019, 8.5));
    }

    public Filmek(ArrayList<Film> filmek_lista) {
        this.filmek_lista = filmek_lista;
    }

    public void FilmekHozaad(Film filmObj) {
        filmek_lista.add(filmObj);
    }

    public List<Film> getFilmek_lista() {
        //return Collections.unmodifiableList(filmek_lista);
        List<Film> masolat= new ArrayList<>(filmek_lista);
        return masolat;
    }
}