/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.fundamentos2;

/**
 *
 * @author ketsu
 */
public class DinamicArray {
    private int array[] = new int[1];
    private int last_pos =0;
    
    public void add_at_end(int n){
        int aux_array[];
        int k=0;
        
        if(last_pos<array.length){
            array[last_pos]=n;
            last_pos++;
        }
        else if (last_pos==array.length){
            
            aux_array=array.clone();
            array = new int[(last_pos+1)*2];
            while(k<=last_pos){
                array[k]=aux_array[k];
                k++;
            }
            
        }
    }
}
