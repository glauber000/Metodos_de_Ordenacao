/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javafx.scene.paint.Color;

/**
 *
 * @author bielf
 */
public class Selection {
    public ArrayList Selec(Elemento[] vetor){
        ArrayList<Elemento> lista = new ArrayList<>();
        for(int i = 1;i<vetor.length ;i++){
            int menor = i;
            for(int j = i+1;j<vetor.length;j++){
                if(vetor[j].getNum()<vetor[menor].getNum())
                    menor = j;
            }
            Elemento aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
            Elemento e = new Elemento();
            e.setPrimeiro(menor);
            e.setSegundo(i);
            lista.add(e);
        }
        return lista;
    }
}
