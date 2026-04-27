/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pryigclase6vargas;

/**
 *
 * @author Alumno
 */
public class Felino extends Animal{
    boolean esSalvaje;
    
    Felino(String nombre, String habitat, String alimentacion, int edad, boolean esSalvaje){
        super (nombre,habitat,alimentacion,edad);
        this.esSalvaje = esSalvaje;
    }
    
    public void trepar(){
        System.out.println("Soy un felino por lo que puedo trepar");
    }
    
    @Override
    void hacerSonido(){
        if (esSalvaje){
            System.out.println("Soy un animal salvaje, por lo que rujo: ROOOARRRRR");
        }
        else {
            System.out.println("Soy un animal domestico, por lo que maullo: miau");
        }
    }
}
