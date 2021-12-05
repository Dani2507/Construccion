/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 18K59LA
 */
public class Cuarto {
   public String nombre;
    public String descripcion;
    public Cuarto salidaNorte;
    public Cuarto salidaSur;
    public Cuarto salidaEste;
    public Cuarto salidaOeste;

    public Cuarto(String name, String description) {
        this.nombre = name;
        this.descripcion = description;
    }
    
      public void setSalidas(Cuarto norte, Cuarto este, Cuarto sur, Cuarto oeste) 
    {
        if(norte != null)
            salidaNorte = norte;
        if(este != null)
            salidaEste = este;
        if(sur != null)
            salidaSur = sur;
        if(oeste != null)
            salidaOeste = oeste;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cuarto getSalidaNorte() {
        return salidaNorte;
    }

    public Cuarto getSalidaSur() {
        return salidaSur;
    }

    public Cuarto getSalidaEste() {
        return salidaEste;
    }

    public Cuarto getSalidaOeste() {
        return salidaOeste;
    }

 
      
    
    
    
}
