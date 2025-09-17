/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio4;

abstract class Animal {
    String nombre;
    String especie;
    double peso;
    double altura;
    int energia;
    boolean vivo;
    
    //Constructor
    public Animal(String nombre, String especie, double peso, double altura ) {
        this.nombre = nombre;
        this.especie = especie;
        setPeso(peso);
        setAltura(altura);
        this.energia = 100;
        this.vivo = true;
    }
    
    public abstract void hacerSonido();
    public abstract void moverse();
    public abstract void alimentarse();
    
    public void dormir (){
        if (!vivo){
            System.out.println(nombre + " no puede dormir porque no vive.");
            return;
        }
        energia = Math.min(100,energia + 30);
        System.out.println(nombre + " está durmiendo. Recupera " + energia + " de energía.");
    }
    
    public void consumirEnergia (int cantidad){
        energia = Math.max(0, energia - cantidad);
        if (energia == 0){
            vivo = false;
            System.out.println(nombre + " agotó su energía y murió.");
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0)this.peso = peso;
        else {
            this.peso = 1.0;
            System.out.println("No corresponde el peso y se le da el valor de 1kg.");
        }
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        if (altura > 0)this.altura = altura;
        else {
            this.altura = 0.1;
            System.out.println("Altura inválida. Se establece altura mínima de 0.1m.");
        }
    }
    
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100){
            this.energia = energia;
            if (energia == 0)vivo = false;
        }         
    }

    public boolean isVivo() {
        return vivo;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - Peso: %.1fkg, Altura: %.1fm, Energía: %d, Vivo: %s",
                nombre, especie, peso, altura, energia, vivo ? "Sí" : "No");
    }
}
