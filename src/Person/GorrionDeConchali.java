package Person;

import Strategies.IAgil;

public class GorrionDeConchali extends Luchador{
	         
        public GorrionDeConchali(){
            Init("GORRION DE CONCHALI!!!!", "agil", new IAgil());
        }    
    
	public String golpear(){
		return("PUÑO CEBOLLERO!!!");}
	        
	public String patear(){
		return("PATADA LACRIMOGENA!!!");}

	public String saltar(){
		return("PIQUERO ROMANTICO!!!");	}
       
        public int danioSpecial(){
            return danio;
        }
        
        
}
