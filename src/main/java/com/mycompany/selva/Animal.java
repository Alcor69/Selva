/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selva;

import java.util.Scanner;

/**
 *
 * @author rb940
 */
public class Animal {
    
    
    //Atributos
    String Nombre;
    int edad;
    

    //Constructor
    public Animal(String Nombre, int edad ) {
        this.Nombre = Nombre;
        this.edad =edad;
    }
    
   
    //metodo comer
    public void comer(){
        System.out.println("El " + Nombre+ " de edad "+edad+" Esta comiendo ");
        
    }
    //metodo Dormir 
    public void dormir(){
        System.out.println("El " + Nombre + " Esta durmiendo");
    
    }
 

   
    
}
