/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.fundamentos2;

import java.lang.reflect.Array;

/**
 *
 * @author ketsu
 */
public class Fundamentos2 {

    public static void main(String[] args) {
        int k=0;
        Employee main_body[] = new Employee[5];
        while(k<5){
            main_body[k]= new Employee();
            System.out.println(main_body[k].getID());
            k++;
        }
    }
}
