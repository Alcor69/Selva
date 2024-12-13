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
public class Mamifero extends Animal{

    
    //Atributo
    public String Pelaje;
    
    //constructor
    
    public Mamifero(String Pelaje, String Nombre, int edad){
        
        super(Nombre, edad);
        this.Pelaje = Pelaje;
        
    }
    //metodo para ingresar datos con el scanner :D
    public void DatosM(Scanner scanner){
        
        System.out.println("Ingrese los datos del mamifero");
        
        System.out.println("Ingrese el nombre del mamifero: ");
        String Nombre = scanner.nextLine();
        
        System.out.println("Ingrese la edad del mamifero: ");
        int edad= scanner.nextInt();
        scanner.nextLine();//sin limpiar el buffer, salta directamente a los resultados, pilas con eso
        
        System.out.println("Ingrese el tipo de pelaje del mamifero: ");
        String Pelaje = scanner.nextLine();
        
        //asignar los datos al objeto
        super.Nombre = Nombre;
        super.edad = edad;
        this.Pelaje = Pelaje;
    
    }  
    public void AmamantarCrias() {
        System.out.println(Nombre +" de pelaje " +Pelaje+" Esta Amamantando a sus crias " );
    }
    
    
    
    
}
