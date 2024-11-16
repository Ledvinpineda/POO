/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author perez
 */
public class Televisor extends Prodcuto{
    private String Pantalla;
    private String Sonido;

    public Televisor(String Pantalla, String Sonido, String color, String Marca, String Modelo) {
        super(color, Marca, Modelo);
        this.Pantalla = Pantalla;
        this.Sonido = Sonido;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getSonido() {
        return Sonido;
    }

    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }
    
}
