/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bielf
 */
package main;

import java.util.ArrayList;
import javafx.scene.Scene;

public class Bolha {
    public ArrayList bolha(Elemento[] vetorz){
            ArrayList<Elemento> lista = new ArrayList<>();
            for (int i = vetorz.length; i >= 2; i--) {
                    for (int j = 2; j < i; j++) {
                        if (vetorz[j - 1].getNum() > vetorz[j].getNum()) {
                        Elemento aux = vetorz[j];
                        vetorz[j] = vetorz[j - 1];
                        vetorz[j - 1] = aux;
                        Elemento e = new Elemento();
                        e.setPrimeiro(j-1);
                        e.setSegundo(j);
                        lista.add(e);
                        }
                        
                    } 
                }
            return lista;
        }
   
}
