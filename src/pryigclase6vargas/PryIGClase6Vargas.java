/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pryigclase6vargas;
import java.util.Scanner;
import java.util.ArrayList;

public class PryIGClase6Vargas {

    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       Felino tigre = new Felino("Robert", "Salvaje", "Carne de ciervo", 15, true);
       
       tigre.presentarse();
       System.out.println();
       tigre.comer();
       System.out.println();
       tigre.hacerSonido();
       System.out.println();
       tigre.trepar();
       System.out.println("-----------------------------");
       
       Felino michi = new Felino("Michifu", "Domestico", "Alimento balanceado", 3, false);
       
       michi.presentarse();
       System.out.println();
       michi.comer();
       System.out.println();
       michi.hacerSonido();
       System.out.println();
       michi.trepar();
       System.out.println("-----------------------------");
       
       Ave hornero = new Ave("Hornerito", "Salvaje", "Semillas", 1, true, 18);
       
       hornero.presentarse();
       System.out.println();
       hornero.comer();
       System.out.println();
       hornero.hacerSonido();
       System.out.println();
       hornero.volar();
       System.out.println("-----------------------------");
       
       Ave avestruz = new Ave("German Carty", "Salvaje", "Hojas", 6, false, 200);
       
       avestruz.presentarse();
       System.out.println();
       avestruz.comer();
       System.out.println();
       avestruz.hacerSonido();
       System.out.println();
       avestruz.volar();
       System.out.println("-----------------------------");
       
       ArrayList<Animal> zoologico = new ArrayList<>();
       zoologico.add(new Felino("Robert", "Salvaje", "Carne de ciervo", 15, true));
       zoologico.add(new Ave("Hornerito", "Salvaje", "Semillas", 1, true, 18));
       zoologico.add(new Felino("Michifu", "Domestico", "Alimento balanceado", 3, false));
       zoologico.add(new Ave("German Carty", "Salvaje", "Hojas", 6, false, 200));
       
       for (Animal a : zoologico){
           a.hacerSonido();
           a.comer();
           if (a instanceof Felino){
           Felino c = (Felino) a;
           c.trepar();
           }
           if (a instanceof Ave){
           Ave av = (Ave) a;
           av.volar();
           }
           System.out.println("");
       }
    }
}
