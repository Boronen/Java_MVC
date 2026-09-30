/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_film;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KovácsKevin(SZF_N_20
 */
public class MVC_film {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Film> modosithatoFilmek = new Filmek().getFilmek_lista();
        for (Film film : modosithatoFilmek) {
            System.out.println("Film "+ film.toString());
        }
        modosithatoFilmek.add(new Film("Nem lehetne a listában!"));

        List<Film> EredetiLista = new Filmek().getFilmek_lista();
        for (Film film : EredetiLista) {
            System.out.println("Film "+ film.toString());
        }        
    }
    
}
