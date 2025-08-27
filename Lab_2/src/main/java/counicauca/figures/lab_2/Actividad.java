/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package counicauca.figures.lab_2;

/**
 *
 * @author JOSE ALEJANDRO LOPERA / JUAN DAVID MEZA PAZ
 */
public class Actividad {
    private int horaInicio; 
    private int horaFin;
    private String accion;

    public Actividad(int horaInicio, int horaFin, String accion) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.accion = accion;
    }
    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public String getAccion() {
        return accion;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    public String line(){
        int i=0;
        int tamanio = accion.length();
        String line = "=======";
        while(i <= tamanio){
            line = line.concat("=");
            i++;
        }
        return line;
    }
   @Override
   public String toString(){
       return "inicio: "+horaInicio+"\nfinal: "+horaFin+"\naccion: "+accion+"\n"+line();
   }
}
