/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author KovácsKevin(SZF_N_20
 */
public class Film {
    private String cim;
    private int megjelenesi_ev;
    private double ertekeles;

    public Film(String nev) {
        this.cim=nev;
        this.ertekeles=0.2;
        this.megjelenesi_ev=2003;
    }

    
    public Film(String nev, int megjelenesi_ev, double ertekeles) {
        setCim(nev);
        this.megjelenesi_ev = megjelenesi_ev;
        this.ertekeles = ertekeles;
    }

    public String getCim() {
        return cim;
    }

private void setCim(String nev) {
    if (nev.length() < 1) {
        this.cim = "Józsi Négy utja";
    } else {
        this.cim = nev;
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

    @Override
    public String toString() {
        return "Film{" + "cim=" + cim + ", megjelenesi_ev=" + megjelenesi_ev + ", ertekeles=" + ertekeles + '}';
    }
        
    
    
    
}
