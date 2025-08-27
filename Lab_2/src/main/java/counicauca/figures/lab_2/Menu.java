/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package counicauca.figures.lab_2;

import java.util.Scanner;

/**
 *
 * @author JOSE ALEJANDRO LOPERA / JUAN DAVID MEZA PAZ
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
        do{
        System.out.println("Elige la opcion que deseas: ");
        System.out.println("1) Agregar tarea");
        System.out.println("2) Mostrar");
        System.out.println("3) Ordenar");
        System.out.println("4) Eliminar");
        System.out.println("5) Aplicar voraz");
        System.out.println("6) Salir");
        String numeroS = sc.nextLine();
        int election = vInt(numeroS);
        if (election < 1 || election > 6) {
            System.out.println("Escribe un valor válido (1-6)\n");
        }

    } while (election < 1 || election > 6);
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
            case 3 ->{dia.ordenar();}
            case 4 ->{
                System.out.println("Escribe la hora de inicio: ");
                int horaI = transformToHour(sc.nextLine());
                if(horaI<0){break;}
                System.out.println("Escribe la hora de finalizacion: ");
                int horaF = transformToHour(sc.nextLine());
                if(horaF<0){break;}
                System.out.println("Escribe la actividad a eliminar: ");
                String accion = sc.nextLine();
                if(vString(accion)){break;}
                
                dia.eliminar(new Actividad(horaI,horaF,accion));
            }
            case 5 ->{
                dia.algorithm_voraz();
                System.out.println("Algoritmo Voraz aplicado correctamente.");
            }
            case 6 ->{
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
