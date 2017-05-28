package Person;

import Strategies.IFuerte;

public class PanchoDelSur extends Luchador {
	
        public PanchoDelSur(){
            Init("PANCHO DEL SUR!!!!", "fuerte", new IFuerte());}
        
	public String golpear(){
		return("PUÑO DEL HOCICON!!!");}
	
	public String patear(){
		return("PATADA SATELITEEE!!!");	}
    
	public String saltar(){
		return("JOJOI!!!");}
        
        public int danioSpecial(){
            return danio;
        }
}
