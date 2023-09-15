/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.fundamentos3;

import java.time.LocalDate;

/**
 *
 * @author ketsu
 */
public class Contract {
    private Developer dev;
    private Project project;
    LocalDate start;
    LocalDate end;
    float salary;
    int worktime;
    static enum Role {J,M,S};
    Role role;
   
    //<editor-fold defaultstate="collapsed" desc="comment">
        public Developer getDev() {
        return dev;
    }

    public Project getProject() {
        return project;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public float getSalary() {
        return salary;
    }

    public int getWorktime() {
        return worktime;
    }

    public Role getRole() {
        return role;
    }
//</editor-fold>
    
    public Contract(Developer dev, Project project){
        this.dev=dev;
        this.project=project;
        worktime = 40;
        start= LocalDate.now();
    }
    
    public Contract(Developer dev, Project project, LocalDate start, LocalDate end, float salary, int worktime, Role role){
        this.dev=dev;
        this.project=project;
        this.start=start;
        this.end=end;
        this.salary=salary;
        this.worktime=worktime;
        this.role=role;
    }

    @Override
    public String toString() {
        return dev.toString();
    }
    
    
}
