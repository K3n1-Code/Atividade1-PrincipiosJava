/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.fundamentos2;

/**
 *
 * @author ketsu
 */
public class Credential {
    private String email;
    private String password;
    Employee user;
    
    public Credential(Employee x){
        user=x;
    }
}
