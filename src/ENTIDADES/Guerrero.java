/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

/**
 *
 * @author Estudiante
 */
public class Guerrero extends Personajes {
    
       private int fuerza;
    private int resistencia;
    
    
     public  void atacarEspecial(Personajes atacado){
        
    }

    @Override
    public String toString() {
        return "Guerrero{" + "resistencia=" + resistencia + '}';
    }
     
     
    

    /**
     * @return the fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return the resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    

}
