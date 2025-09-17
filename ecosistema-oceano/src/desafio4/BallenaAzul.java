/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio4;

/**
 *
 * @author luciano
 */
public class BallenaAzul extends Animal implements HabitatOceano {

    private int profundidadMaxima;

    public BallenaAzul(String nombre, double peso, double altura) {
        super(nombre, "Ballena", peso, altura);
        this.profundidadMaxima = 450;
    }

    @Override
    public void hacerSonido() {
        if (!vivo || energia < 10) {
            System.out.println("A la ballena " + nombre + " no le es posible emitir sonido.");
            return;
        }
        System.out.println("La ballena " + nombre + " emite un sonido que se expande y escucha a kilómetros de distancia!");
        consumirEnergia(5);
    }

    @Override
    public void moverse() {
        if (!vivo || energia < 15) {
            System.out.println("La ballena " + nombre + " no puede moverse.");
            return;
        }
        System.out.println("La ballena " + nombre + " se desplaza con grandes movimientos por el océano!");
        consumirEnergia(10);
    }

    @Override
    public void alimentarse() {
        if (!vivo || energia < 15) {
            System.out.println("La ballena " + nombre + " no puede alimentarse.");
            return;
        }
        System.out.println("La ballena " + nombre + " come toneladas de krill!");
        energia = Math.min(100, energia + 25);
        consumirEnergia(10);
    }
    
     @Override
    public void nadar() {
        if (!vivo || energia < 8) {
            System.out.println("La ballena " + nombre + " no puede nadar.");
            return;
        }
        System.out.println("La ballena " + nombre + " nada gracias a su cola.");
        consumirEnergia(8);
    }
    
    @Override
    public void bucear(int profundidad) {
        if (!vivo || energia < 15) {
            System.out.println("La ballena " + nombre + " no puede bucear.");
            return;
        }
        if (profundidad > profundidadMaxima) {
            System.out.println("La ballena " + nombre + " no puede bucear tan profundo. Máximo: " + profundidadMaxima + " metros.");
            return;
        }
        System.out.println("La ballena " + nombre + " bucea hasta " + profundidad + " metros de profundidad.");
        consumirEnergia(12);
    }

}
