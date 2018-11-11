/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author bielf
 */
public class Insertion {
    public ArrayList insertionSort(Elemento[] vetorz) {
            ArrayList<Elemento> lista = new ArrayList<>();
                for (int i = 0; i < vetorz.length; i++) 
                {
                        Elemento a = vetorz[i];
                        for (int j = i - 1; j >= 1 && vetorz[j].getNum() > a.getNum(); j--)
                        {
                                vetorz[j + 1] = vetorz[j];
                                vetorz[j] = a;
                                Elemento e = new Elemento();
                                e.setPrimeiro(j);
                                e.setSegundo(j+1);
                                lista.add(e);
                        }                       
                }
                return lista;
        }
}
