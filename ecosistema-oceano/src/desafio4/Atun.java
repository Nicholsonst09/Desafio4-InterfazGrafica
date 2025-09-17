/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio4;

/**
 *
 * @author santi
 */
class Atun extends Animal implements HabitatOceano{
    private boolean enCardumen;

    public Atun(String nombre, double peso, double altura) {
        super(nombre, "Atún Rojo", peso, altura);
        this.enCardumen = true;
    }
    
    @Override
    public void hacerSonido() {
        if (!vivo || energia < 2) {
            System.out.println("El " + nombre + " no puede hacer sonido.");
            return;
        }
        System.out.println("El " + nombre + " emite pequeñas vibraciones para comunicarse.");
        consumirEnergia(2);
    }
    
    @Override
    public void moverse() {
        if (!vivo || energia < 8) {
            System.out.println("El " + nombre + " no puede moverse.");
            return;
        }
        System.out.println("El " + nombre + " se mueve con el cardumen.");
        consumirEnergia(8);
    }
    
    @Override
    public void alimentarse() {
        if (!vivo || energia < 10) {
            System.out.println("El atún" + nombre + " no puede alimentarse.");
            return;
        }
        System.out.println("El atún" + nombre + " se alimenta de plancton y peces pequeños.");
        energia = Math.min(100, energia + 20);
        consumirEnergia(10);
    }
    
    @Override
    public void nadar() {
        if (!vivo || energia < 6) {
            System.out.println("El atún" + nombre + " no puede nadar.");
            return;
        }
        System.out.println("El atún" + nombre + " nada rápidamente en línea recta.");
        consumirEnergia(6);
    }
    
    @Override
    public void bucear(int profundidad) {
        if (!vivo || energia < 12) {
            System.out.println("El atún " + nombre + " no puede bucear.");
            return;
        }
        System.out.println("El atún " + nombre + " bucea hasta " + profundidad + " metros buscando alimento.");
        consumirEnergia(12);
    }
    
    @Override
    public void navegarCorrientes() {
        if (!vivo || energia < 5) {
            System.out.println("El atún " + nombre + " no puede navegar corrientes.");
            return;
        }
        System.out.println("El atún " + nombre + " migra gracias las corrientes del océano.");
        consumirEnergia(5);
    }
    
    public void formarCardumen(Atun otroAtun) {
        if (!vivo || energia < 5) {
            System.out.println("El atún " + nombre + " no puede formar cardumen.");
            return;
        }
        System.out.println("El atún " + nombre + " se agrupa con " + otroAtun.getNombre() + " para mayor protección.");
        this.enCardumen = true;
        otroAtun.enCardumen = true;
        consumirEnergia(5);
    }
    
    public void huir() {
        if (!vivo || energia < 10) {
            System.out.println("El atún " + nombre + " no puede huir.");
            return;
        }
        if (enCardumen) {
            System.out.println("El atún " + nombre + " usa la confusión del cardumen para escapar!");
        } else {
            System.out.println("El atún " + nombre + " huye a máxima velocidad!");
        }
        consumirEnergia(10);
    }

    public boolean isEnCardumen() {
        return enCardumen;
    }

    public void setEnCardumen(boolean enCardumen) {
        this.enCardumen = enCardumen;
    }
}
