/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package counicauca.figures.lab_2;

import java.util.Scanner;

/**
 *
 * @author ING-SIS
 */
public class Menu{
    private Scanner sc;
    private Dia dia;
    Menu(){
        sc = new Scanner(System.in);
        dia = new Dia();
    }
    public boolean Visual(){
        boolean repetir = true;
        System.out.println("Elige la opcion que deseas: ");
        System.out.println("1) Agregar tarea");
        System.out.println("2) Mostrar");
        System.out.println("5) Salir");
        String numeroS = sc.nextLine();
        int election = vInt(numeroS);
        switch(election){
            case 1 ->{
                System.out.println("Escribe la hora de inicio: ");
                int horaI = transformToHour(sc.nextLine());
                if(horaI<0){break;}
                System.out.println("Escribe la hora de finalizacion: ");
                int horaF = transformToHour(sc.nextLine());
                if(horaF<0){break;}
                System.out.println("Escribe la actividad a realizar: ");
                String accion = sc.nextLine();
                if(vString(accion)){break;}
                
                dia.agregar(new Actividad(horaI,horaF,accion));
            }
            case 2 ->{dia.mostrarActividades();}
            case 5 ->{
                System.out.println("Finalizando...");
                repetir = false;
            }
            default ->{
                System.out.println("Escribe un valor valido");
            }
        }
        return repetir;
    }
    private int vInt(String numeroS){
        int numero=0;
        if(!vString(numeroS)){
            try{
                numero = Integer.parseInt(numeroS);
            }catch(NumberFormatException e){
                System.out.println("Escribe un valor valido");
                numero=-1;
            }
        }
        return numero;
    }
    private int transformToHour(String numeroS_Completo){
        String numeroS="";
        int numero=0;
        if(!vString(numeroS_Completo)){
            numeroS=numeroS_Completo.replace(":","");
            numero = vInt(numeroS);
        }
        return vDate(numero);
    }
    private int vDate(int numero){
        if(numero<0 || numero>2400){
            System.out.println("El formato no es correcto...");
            numero=-1;
        }
        return numero;
    }
    private boolean vString(String cadena){
        if(cadena.isEmpty()){
            System.out.println("Escribe un valor valido...");
        }
        return cadena.isEmpty();
    }
}
