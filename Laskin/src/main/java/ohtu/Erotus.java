/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author pullis
 */
public class Erotus implements Komento {
    
    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;
    private int alku;
    
    public Erotus (Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
    
    @Override
    public void suorita() {
        int arvo = 0;
        alku = Integer.parseInt(tuloskentta.getText()) + arvo;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
            int tulos = Integer.parseInt(tuloskentta.getText()) - arvo;
            syotekentta.setText("");
            tuloskentta.setText("" + tulos);
        } catch (Exception e) {
        }
    }

    @Override
    public void peru() {
        syotekentta.setText("");
        tuloskentta.setText("" + alku);
    }
}
