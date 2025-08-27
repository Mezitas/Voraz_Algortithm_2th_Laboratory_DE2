/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package counicauca.figures.lab_2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author JOSE ALEJANDRO LOPERA / JUAN DAVID MEZA PAZ
 */
public class Dia {
    private ArrayList<Actividad> actividades;
    private ArrayList<Actividad> actividades_Dia;

    Dia(){
        actividades = new ArrayList();
        actividades_Dia = new ArrayList();
    }
    //methods
    public void mostrarActividades(){
        if(actividades.isEmpty()){
            System.out.println("El dia no tiene ninguna actividad");
        }
        Iterator<Actividad> iterator = actividades.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
    public void ordenar(){
        actividades.sort((o1, o2) -> o1.getHoraInicio() - o2.getHoraInicio());
    }
    public void agregar(Actividad a){
        if(actividades.add(a)){
            System.out.println("Agregado correctamente");
        }else{
            System.out.println("Algo fallo...");
        }
    }
    public void eliminar(Actividad a){
        if(actividades.remove(a)){
            System.out.println("Eliminado correctamente");
        }else{
            System.out.println("Algo fallo...");
        }
    }
    public void actividadesDelDia(){
        algorithm_voraz();
        Iterator<Actividad> iterator = actividades_Dia.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
    private void algorithm_voraz(){
        Actividad a = actividades.getFirst();
        this.actividades_Dia.add(a);
        actividades.removeFirst();
        for(Actividad b: actividades){
            if(a.getHoraFin()<=b.getHoraInicio()){
                this.actividades_Dia.add(b);
                a=b;
            }
        }   
    }
}
