/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author perez
 */
public class Laptop extends Prodcuto{
    private String Pantalla;
    private String Teclado;

    public Laptop(String Pantalla, String Teclado, String color, String Marca, String Modelo) {
        super(color, Marca, Modelo);
        this.Pantalla = Pantalla;
        this.Teclado = Teclado;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getTeclado() {
        return Teclado;
    }

    public void setTeclado(String Teclado) {
        this.Teclado = Teclado;
    }
    

    
}
