/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3_grupo2;

public class Conversor {
    
    public Conversor() {
    }
    
    //Métodos Sobrecargados
    public double convertir(double perro)
    {
        return (perro*9/5) + 32;
    }
    public double convertir(float dato_km)
    {
        return dato_km/1.60934;
    }
    public String convertir(int dato_sg)
    {
        int minutos = dato_sg / 60;
        int sg_restantes = dato_sg % 60;
        return ("Son " + minutos + " minutos y " + sg_restantes + " segundos");
        
    }
}
