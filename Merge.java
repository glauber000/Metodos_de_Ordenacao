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
public class Merge {
    ArrayList<Elemento> lis = new ArrayList<>();
    public ArrayList merge(Elemento [] vetor){
        Elemento aux[] = new Elemento[vetor.length];
        merge(vetor,aux,0,vetor.length-1);
        return lis;
    }
    private void merge(Elemento [] vetor,Elemento [] aux,int ini,int fim){
        if(ini < fim){
            int meio = (ini+fim)/2;
            merge(vetor,aux,ini,meio);
            merge(vetor,aux,meio+1,fim);
            intercalar(vetor,aux,ini,meio,fim);
        }
    }
    private void intercalar(Elemento [] vetor,Elemento [] aux,int ini,int meio,int fim){
        for(int k = ini;k<=fim;k++){
            aux[k] = vetor[k];
        }
        int i = ini;
        int j = meio+1;
        for(int k = ini;k<=fim;k++){
            if(i>meio){
                vetor[k] = aux[j];
                Elemento e = new Elemento();
                e.setPrimeiro(k);
                e.setSegundo(i);
                lis.add(e);
                j++;
            }
            else if(j>fim){
                vetor[k] = aux[i];
                Elemento e = new Elemento();
                e.setPrimeiro(k);
                e.setSegundo(i);
                lis.add(e);
                i++;
            }
            else if(aux[i].getNum()<aux[j].getNum()){
                vetor[k] = aux[i];
                Elemento e = new Elemento();
                e.setPrimeiro(k);
                e.setSegundo(i);
                lis.add(e);
                i++;
            }
            else{
                vetor[k] = aux[j];
                Elemento e = new Elemento();
                e.setPrimeiro(k);
                e.setSegundo(j);
                lis.add(e);
                j++;
            }
        }
    }
    
}
