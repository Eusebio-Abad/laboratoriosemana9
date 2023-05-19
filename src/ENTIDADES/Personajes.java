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
public abstract class  Personajes {
    
     private String hombre;
    private int vida;
    private int nivel;
    
     public  void atacar(Personajes atacando){
        
    }
     public void defender(Personajes atacante){
         
     }

    /**
     * @return the hombre
     */
    public String getHombre() {
        return hombre;
    }

    /**
     * @param hombre the hombre to set
     */
    public void setHombre(String hombre) {
        this.hombre = hombre;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
    
