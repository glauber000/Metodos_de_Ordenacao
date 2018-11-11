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
public class Quick {
    ArrayList<Elemento> lista = new ArrayList<>();
    public ArrayList quickSort(Elemento vetor[]) {
        quickSort(vetor, 1, vetor.length -1);
        return lista;
    }

    private void quickSort(Elemento[] vetor, int esq, int dir) {
        if(esq<dir){
            int j = separar(vetor,esq,dir);
            quickSort(vetor,esq,j-1);
            quickSort(vetor,j+1,dir);
        }
    }

    private int separar(Elemento[] vetor, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        Elemento pivo = vetor[esq];
        while(i<=j){
            if(vetor[i].getNum() <= pivo.getNum()) i++;
            else if(vetor[j].getNum()>pivo.getNum()) j--;
            else if(i<=j){
                swap(vetor,i,j);
                i++;
                j--;
                
            }
        }
        swap(vetor,esq,j);
        return j;
    }
    private void swap(Elemento[] v, int i, int j){
        Elemento aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        Elemento e = new Elemento();
        e.setPrimeiro(i);
        e.setSegundo(j);
        lista.add(e);
    }
    

}
