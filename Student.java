/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vojta
 */
public class Student extends Person{
    private int credit;
    
    public Student(String name, String adress){
        super(name, adress);
        this.credit = 0;
    }
    
    public Student(String name, String adress, int credit){
        super(name, adress);
        this.credit = credit;
    }
    
    public int credits(){
        return this.credit;
    }
    
    public void study(){
        this.credit = this.credit + 1;
    }
    
    public String toString(){       
        return super.toString() + "\n  Study credits " + this.credit;
    }
}
