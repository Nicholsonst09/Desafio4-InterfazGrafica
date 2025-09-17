/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio4;


public class EcosistemaOceano {

    
    public static void main(String[] args) {
        System.out.println("-- ECOSISTEMA: OCÉANO ===\n");
        
        //Se crean los animales
        BallenaAzul ballena = new BallenaAzul("Dora", 17500, 22);
        TiburonBlanco tiburon = new TiburonBlanco("Tiburoncin", 2000, 6);
        Atun atun1 = new Atun("Atuncito", 270, 2);
        Atun atun2 = new Atun("Pepe", 300, 2.5);
        Pulpo pulpo = new Pulpo("Paul", 80, 3);
        
        //Estado inicial del ecosistema
        System.out.println("ANIMALES DEL OCÉANO:");
        System.out.println(ballena);
        System.out.println(tiburon);
        System.out.println(atun1);
        System.out.println(atun2);
        System.out.println(pulpo);
        System.out.println("\n" + "=".repeat(15) + "\n");
        
        //Interacciones
        System.out.println("SIMULACIÓN DEL ECOSISTEMA\n");
        
        System.out.println("-- Formación de Cardumen --");
        atun1.formarCardumen(atun2);
        
        System.out.println("\n- Comunicación Marina -");
        ballena.hacerSonido();
        
        // El pulpo se camufla
        System.out.println("\n-  Estrategias de Supervivencia -");
        pulpo.camuflar();
        
        // El tiburón caza atún
        System.out.println("\n- Depredación -");
        tiburon.cazarAtun(atun1);
        
        // El pulpo ataca al tiburón por sorpresa
        System.out.println("\n- Ataque Sorpresa -");
        pulpo.atacarConTentaculos(tiburon);
        
        // La ballena intimida al tiburón
        System.out.println("\n- Competenecia entre gigantes -");
        ballena.atacarTiburon(tiburon);
        
        // Navegación en corrientes
        System.out.println("\n- Navegación -");
        ballena.navegarCorrientes();
        atun2.navegarCorrientes();
        
        // Alimentación
        System.out.println("\n- Hora de comer -");
        ballena.alimentarse();
        if (atun2.isVivo()) atun2.alimentarse();
        pulpo.alimentarse();
        
        // Buceo 
        System.out.println("\n- Explorando el fondo del océano -");
        ballena.bucear(300);
        tiburon.bucear(200);
        pulpo.bucear(150);
        
        /* // Descanso
        System.out.println("\n--- Período de Descanso ---");
        ballena.dormir();
        tiburon.dormir();
        if (atun2.isVivo()) atun2.dormir();
        pulpo.dormir(); */
        
        
        System.out.println("\n -ESTADO FINAL:");
        System.out.println(ballena);
        System.out.println(tiburon);
        System.out.println(atun1);
        System.out.println(atun2);
        System.out.println(pulpo);
        
        //Supervivencia
        int vivos = 0;
        Animal[] animales = {ballena, tiburon, atun1, atun2, pulpo};
        for (Animal animal : animales){
            if (animal.isVivo()) vivos++;
        }
        
        //FINAL
        System.out.println("\nAnimales vivos: " + vivos + "/" + animales.length);
        System.out.println("\nFin!");
    }
    
}
