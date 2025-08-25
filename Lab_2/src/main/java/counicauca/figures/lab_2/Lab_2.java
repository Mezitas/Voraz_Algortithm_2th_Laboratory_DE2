/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package counicauca.figures.lab_2;

/**
 *
 * @author ING-SIS
 */
public class Lab_2 {

    public static void main(String[] args) {
        Actividad ac1 = new Actividad(1345,1550,"saludar");
        Actividad ac2 = new Actividad(1034,1400,"saludar2");
        Actividad ac3 = new Actividad(730,1000,"saludar3");
        Actividad ac4 = new Actividad(830,1110,"saludar4");
                        
        Dia dia = new Dia();
        dia.agregar(ac1);
        dia.agregar(ac2);
        dia.agregar(ac3);
        dia.agregar(ac4);
        dia.mostrarActividades();
        dia.ordenar();
        System.out.println("======================");
        dia.mostrarActividades();
        System.out.println("======================");
        dia.actividadesDelDia();
    }
}
