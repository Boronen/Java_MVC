/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_film;

/**
 *
 * @author KovácsKevin(SZF_N_20
 */
public class Film {
    private String nev;
    private int megjelenesi_ev;
    private double ertekeles;

    public Film(String nev, int megjelenesi_ev, double ertekeles) {
        setNev(nev);
        this.megjelenesi_ev = megjelenesi_ev;
        this.ertekeles = ertekeles;
    }

    public String getNev() {
        return nev;
    }

    private void setNev(String nev) {
        if (nev.length()<2) {
            this.nev="Józsi Négy utja";
        }
    }

    public int getMegjelenesi_ev() {
        return megjelenesi_ev;
    }

    private void setMegjelenesi_ev(int megjelenesi_ev) {
        this.megjelenesi_ev = megjelenesi_ev;
    }

    public double getErtekeles() {
        return ertekeles;
    }

    public void setErtekeles(double ertekeles) {
        this.ertekeles = ertekeles;
    }
    
    
    
    
}
