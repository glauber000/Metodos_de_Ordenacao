/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.scene.paint.Color;



/**
 *
 * @author bielf
 */
public class Elemento {
    private int primeiro;
    private int segundo;
    private int num;
    private int z;
    private Color c;

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
    
    

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    
    public Elemento(){
        
    }
    public Elemento(int numero){
        this.num = numero;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    

    
    
    
    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    
}
