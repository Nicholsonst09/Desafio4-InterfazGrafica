/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio4;

/**
 *
 * @author luciano
 *
 */
class TiburonBlanco extends Animal implements HabitatOceano {

    private int velocidadMaxima;

    public TiburonBlanco(String nombre, double peso, double altura) {
        super(nombre, "Tiburón Blanco", peso, altura);
        this.velocidadMaxima = 60;
    }
    
      @Override
     public void hacerSonido() {
        if (!vivo || energia < 3) {
            System.out.println("El tiburón " + nombre + " no puede hacer sonido.");
            return;
        }
        System.out.println("El tiburón " + nombre + " se acerca silenciosamente con un leve sonido.");
        consumirEnergia(3);
    }

}
