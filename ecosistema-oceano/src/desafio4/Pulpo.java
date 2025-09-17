/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio4;

/**
 *
 * @author santi
 */
class Pulpo extends Animal implements HabitatOceano{
    private boolean camuflado;

    public Pulpo(String nombre, double peso, double altura) {
        super(nombre, "Gran Pulpo del Atlántico", peso, altura);
        this.camuflado = false;
    }
    
    @Override
    public void hacerSonido() {
        if (!vivo || energia < 3) {
            System.out.println("El pulpo " + nombre + " no puede hacer sonido.");
            return;
        }
        System.out.println("El pulpo " + nombre + " cambia de color como forma de comunicación.");
        consumirEnergia(3);
    }
    
    @Override
    public void moverse() {
        if (!vivo || energia < 10) {
            System.out.println("El pulpo " + nombre + " no puede moverse.");
            return;
        }
        System.out.println("El pulpo " + nombre + " se propulsa expulsando agua por su sifón.");
        consumirEnergia(10);
    }
    
    @Override
    public void alimentarse() {
        if (!vivo || energia < 15) {
            System.out.println("El pulpo " + nombre + " no puede alimentarse.");
            return;
        }
        System.out.println("El pulpo " + nombre + " usa sus tentáculos para alimentarse.");
        energia = Math.min(100, energia + 25);
        consumirEnergia(15);
    }
    
    @Override
    public void nadar() {
        if (!vivo || energia < 12) {
            System.out.println("El pulpo " + nombre + " no puede nadar.");
            return;
        }
        System.out.println("El pulpo " + nombre + " nada gracias a sus ocho tentáculos.");
        consumirEnergia(12);
    }
    
    @Override
    public void bucear(int profundidad) {
        if (!vivo || energia < 8) {
            System.out.println("El pulpo " + nombre + " no puede bucear.");
            return;
        }
        System.out.println("El pulpo " + nombre + " desciende hasta " + profundidad + " metros al fondo del océano.");
        consumirEnergia(8);
    }
    
    @Override
    public void navegarCorrientes() {
        if (!vivo || energia < 10) {
            System.out.println("El pulpo " + nombre + " no puede navegar corrientes.");
            return;
        }
        System.out.println("El pulpo " + nombre + " usa las corrientes para desplazarse más fácilmente.");
        consumirEnergia(10);
    }
    
    public void camuflar() {
        if (!vivo || energia < 8) {
            System.out.println("El pulpo " + nombre + " no puede camuflarse.");
            return;
        }
        camuflado = true;
        System.out.println("El pulpo " + nombre + " se camufla perfectamente!");
        consumirEnergia(8);
    }
    
    public void atacarConTentaculos(Animal presa) {
        if (!vivo || energia < 20) {
            System.out.println("El pulpo " + nombre + " no tiene energía para atacar.");
            return;
        }
        if (camuflado) {
            System.out.println("El pulpo " + nombre + " ataca por sorpresa desde su camuflaje a " + presa.getNombre() + "!");
            presa.consumirEnergia(30);
            camuflado = false;
        } else {
            System.out.println("El pulpo " + nombre + " extiende sus tentáculos para atrapar a " + presa.getNombre() + "!");
            presa.consumirEnergia(20);
        }
        consumirEnergia(20);
    }

    public boolean isCamuflado() {
        return camuflado;
    }
    
    
}