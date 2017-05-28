
import Apoyo.*;
import Strategys.Luchador;
import Person.*;
import java.util.Scanner;

public class FightEngine {
    Luchador luchador; 
    
    public FightEngine(){

        int opcion;
	        
        System.out.println("Empieza el juego!!!");
	System.out.println("Selecciona tu luchador segun el numero: ");
        System.out.println("1. Choro Portenho");
        System.out.println("2. Minero Warrior");
        System.out.println("3. Gorrion de Conchali");
        System.out.println("4. Halcon de Chicureo");
        System.out.println("5. Pancho del Sur");
                
	Scanner seleccion = new Scanner(System.in);
		
	opcion = Integer.parseInt(seleccion.nextLine());
	
	System.out.println(opcion);
	switch(opcion) {
            case 1: luchador = new ChoroPortenho(); //magico
                break;
            case 2: luchador = new MineroWarrior(); //fuerte
                break;
            case 3: luchador = new GorrionDeConchali(); //agil  
                break;
            case 4: luchador = new HalconDeChicureo(); //agil
                break;
            case 5: luchador = new PanchoDelSur(); //fuette
        }
        System.out.println(luchador.getNombre() + " inicia a batalla!");
                
        while(true){
            System.out.println("Selecciona tu equipo de apoyo (Finaliza con 0):");
            System.out.println("1. Iluminati");
            System.out.println("2. NoPeleen");
            System.out.println("3. Tarro");
            opcion = Integer.parseInt(seleccion.nextLine());
            if(opcion == 0){
                break;
            }
            else{
                switch(opcion) {
                    case 1: luchador = new Iluminati(luchador);
                        System.out.println("Elegido Iluminati");
                        break;
                    case 2: luchador = new NoPeleen(luchador);
                        System.out.println("Elegido No-Peleen");
                        break;
                    case 3: luchador = new Tarro(luchador);  
                        System.out.println("Elegido Tarro");
                        break;                
                }
            }
        }
        
        System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-ESPECIAL");
        
        opcion = Integer.parseInt(seleccion.nextLine());
        switch(opcion) {
            case 1: System.out.println(luchador.golpear());
                break;
            case 2: System.out.println(luchador.patear());
                break;
            case 3: System.out.println(luchador.saltar());
                break;
            case 4: System.out.println(luchador.getSpecialString() + " DAÑOOOO " + luchador.danioSpecial());
        }
        
        System.out.println("FIN DEL JUEGO. 2...");
	
    }
}
