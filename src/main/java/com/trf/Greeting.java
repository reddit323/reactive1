/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trf;

/**
 *
 * @author raulp
 */
public class Greeting {
    
    private String message;
    
    public Greeting(){
        
    }
    public Greeting(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    } 
    public void setMessage(String message){
        this.message=message;
    }
    @Override
    public String toString(){
        return "Greeting{"+
                "message="+message+'\''+'}';
    }
    
    
}
