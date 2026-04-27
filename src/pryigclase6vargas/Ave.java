/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pryigclase6vargas;


public class Ave extends Animal{
    boolean puedeVolar;
    double envergaduraCm;
    
    Ave(String nombre, String habitat, String alimentacion, int edad, boolean puedeVolar,double envergaduraCm){
        super (nombre,habitat,alimentacion,edad);
        this.puedeVolar = puedeVolar;
        this.envergaduraCm = envergaduraCm;
    }
    
    void volar(){
        if (puedeVolar){
            System.out.println("Soy un ave verdadera por lo que puedo volar :)");
        }
        else {
            System.out.println("Soy un ave falsa, por lo que no puedo volar :(");
        }
    }
    @Override
    void hacerSonido(){
            System.out.println("Soy un ave, por lo que canto: pio pio");
        }

}
