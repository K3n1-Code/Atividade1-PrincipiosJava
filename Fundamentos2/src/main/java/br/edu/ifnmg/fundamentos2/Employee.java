/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.fundamentos2;

import java.time.LocalDate;

/**
 *
 * @author ketsu
 */
public class Employee {
    public enum Profile {
        WORKER('W'),
        MANAGER('M'),
        BOSS('B');
    
    
        public final char label;

        private Profile(char label) {
           this.label = label;
        }
    }
    
    private int ID;
    private String name;
    private static int ammount;
    private Profile profile;
    private Credential credential= new Credential(this);
    static {
        ammount =1;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Set n Get">
    

    public void setName(String x){
        name=x;
    }
    public String getName(){
        return name;
    }
    
    public int getID(){
        return ID;
    }
    
    public static int getAmmount(){
        return ammount;
    }
  //</editor-fold>  
    public Employee(){
        ID=LocalDate.now().getYear()*10000+ammount;
        ammount++;
        
    }
    
    public Employee(String x){
        setName(x);
        ID=LocalDate.now().getYear()*10000+ammount;
        ammount++;
        
    }
    
}
