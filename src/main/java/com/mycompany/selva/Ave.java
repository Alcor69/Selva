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
public class Ave extends Animal{
    
    //Atributos
    public double envergaduraAlas;
    
    //Constructor

    public Ave(double envergaduraAlas, String Nombre, int edad) {
        super(Nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }
    
    public void DatosA(Scanner scanner){
        
        System.out.println("Ingrese los datos de la Ave ");
        
        System.out.println("Ingrese el nombre del Ave: ");
        String Nombre = scanner.nextLine();
        
        System.out.println("Ingrese la edad del Ave: ");
        int edad = scanner.nextInt();
        scanner.nextLine();//sin limpiar el buffer, salta directamente a los resultados, pilas con eso
        
        System.out.println("Ingrese la envergadura de la Ave: ");
        double envergaduraAlas = scanner.nextDouble();
        
        //Asignar los datos al objeto
        super.Nombre = Nombre;
        super.edad = edad;
        this.envergaduraAlas = envergaduraAlas;
    }
    
    public void Volar(){
        System.out.println(Nombre +" esta volando con una envergadura de " + envergaduraAlas +" metros");
    
    }
    
}
