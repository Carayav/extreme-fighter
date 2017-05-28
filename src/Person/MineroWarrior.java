package Person;

import Strategies.IFuerte;

public class MineroWarrior extends Luchador{
    
        public MineroWarrior(){
            Init("Minero Warrior", "fuerte", new IFuerte() );}
        
        public String golpear(){
		return("PUÑO DEL PIRQUINEROOOO!!!");}
	
	public String patear(){
		return("PATADA DEL CATEADOOOOOOR!!!");}

	public String saltar(){
		return("SALTO EXPLOSIVOOOOO!!!");}
        
        public int danioSpecial(){
            return danio;
        }
}
