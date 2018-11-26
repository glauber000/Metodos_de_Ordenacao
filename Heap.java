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
public class Heap {
    ArrayList<Elemento> lista = new ArrayList<>();
    public ArrayList heapS(Elemento[] vett){
        montaAv(vett);
        
        int n = vett.length;
        
        for(int i = vett.length - 1; i>0;i--){
            Elemento aux = vett[i];
            vett[i] = vett[0];
            vett[0] = aux;
            ordenaAv(vett, 0,--n);
            Elemento e = new Elemento();
            e.setPrimeiro(i);
            e.setSegundo(0);
            lista.add(e);
        }
        return lista;
    }
    
    public void montaAv(Elemento[] v){
        for(int pos = (v.length - 1)/2;pos>=0;pos--){
            ordenaAv(v, pos, v.length);
        }
    }
    
    public void ordenaAv(Elemento [] vet, int pos, int tam){
        int f1 = 2 * pos + 1;
        int f2 = f1 + 1;
        
        if(f1 < tam){
            if(f2 < tam){
                if(vet[f1].getNum() < vet[f2].getNum()){
                    f1 = f2;
                }
            }
            if(vet[f1].getNum() > vet[pos].getNum()){
            Elemento aux = vet[f1];
            vet[f1] = vet[pos];
            vet[pos] = aux;
            Elemento e = new Elemento();
            e.setPrimeiro(pos);
            e.setSegundo(f1);
            lista.add(e);
            ordenaAv(vet, f1, tam);
            }
        }
        
    }
}
