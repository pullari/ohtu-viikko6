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
public class Nollaa implements Komento {
    
    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;
    private int alku;
    
    public Nollaa (Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }
    
    @Override
    public void suorita() {
        alku = Integer.parseInt(tuloskentta.getText());
        syotekentta.setText("");
        tuloskentta.setText("0");
    }

    @Override
    public void peru() {
        syotekentta.setText("");
        tuloskentta.setText("" + alku);
    }
}
