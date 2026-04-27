/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pryigclase6vargas;

/**
 *
 * @author Alumno
 */

     abstract class Animal {
        String nombre;
        String habitat;
        String alimentacion;
        int edad;
        
        Animal(String nombre, String habitat, String alimentacion, int edad){
            this.nombre = nombre;
            this.habitat = habitat;
            this.alimentacion = alimentacion;
            this.edad = edad;
        }
        
        void presentarse(){
            System.out.println("Yo soy " + nombre + ", me alimento de " 
                    + alimentacion+ " y tengo " + edad + " anios");
        }
        
        void comer(){
            System.out.println("Yo estoy comiendo " + alimentacion);
        }
        
        void hacerSonido(){
            System.out.println("*Hace ruido*");
        }
    
}

