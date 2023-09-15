/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.edu.ifnmg.fundamentos2;
//Declaring an ENUM with not number thingies
/**
 *
 * @author ketsu
 */
public enum Profile {
    WORKER('W'),
    MANAGER('M'),
    BOSS('B');
    
    
    public final char label;

    private Profile(char label) {
        this.label = label;
    }
}
