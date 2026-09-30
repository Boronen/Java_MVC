/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_film;

/**
 *
 * @author KovácsKevin(SZF_N_20
 */
public class KonzolNezet {
private Filmek modell;

    public KonzolNezet(Filmek modell) {
        this.modell = modell;
    }
    public void megjelenit(){
        for (Film film : modell.getFilmek_lista()) {
            System.out.println(film.toString());
        }
    }

}
