package Person;

import Strategies.IAgil;

public class HalconDeChicureo extends Luchador{
    
	public HalconDeChicureo(){
            Init("HALCON DE CHICUREO!!!!", "agil", new IAgil());}
	
	public String golpear(){
		return("BRAZO BOOMERANG!!!");}
		
        public String patear(){
		return("PATADA DE BIEN LEJOS!!!");}

        public String saltar(){
		return("SALTO DEL AVION!!!");}
        
        public int danioSpecial(){
            return danio;
        }
        

}
