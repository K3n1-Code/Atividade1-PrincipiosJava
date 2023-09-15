/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.fabvehi;

/**
 *
 * @author ketsu
 */
public class Colour {
    int r;
    int g;
    int b;
    
    public Colour(int r,int g,int b){
        this.r=r;
        this.g=g;
        this.b=b;
    }
    
    public Colour white(){
        r=1; g=1; b=1;
        return this;
    }
    
    public Colour black(){
        r=0; g=0; b=0;
        return this;
    }
    
    
    
}
