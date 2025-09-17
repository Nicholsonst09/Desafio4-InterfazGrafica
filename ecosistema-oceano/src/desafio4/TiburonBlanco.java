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

    @Override
    public void moverse() {
        if (!vivo || energia < 12) {
            System.out.println("El tiburón " + nombre + " no puede moverse.");
            return;
        }
        System.out.println("El tiburón " + nombre + " se mueve con velocidad buscando su presa.");
        consumirEnergia(12);
    }
    
        @Override
    public void alimentarse() {
        if (!vivo || energia < 20) {
            System.out.println("El tiburón " + nombre + " no puede alimentarse.");
            return;
        }
        System.out.println("El tiburón " + nombre + " devora su presa!");
        energia = Math.min(100, energia + 35);
        consumirEnergia(20);
    }
    
    @Override
    public void nadar() {
        if (!vivo || energia < 10) {
            System.out.println("El tiburón " + nombre + " no puede nadar.");
            return;
        }
        System.out.println("El tiburón " + nombre + " nada con movimientos perfectos.");
        consumirEnergia(10);
    }
    
    

}
