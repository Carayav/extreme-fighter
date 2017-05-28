package Person;

import Strategies.IMago;

public class ChoroPortenho extends Luchador {       
    
        public ChoroPortenho(){            
            Init("Choro Portenho", "mago", new IMago());}
        
        public String golpear(){
		return("ALETAZO MARINO!!!");}
	
        public String patear(){
		return("PATADA DE LA JAIBAAAAA!!!");}
	
        public String saltar(){
		return("PIQUERO INFERNAAAAAL!!!");}

        public int danioSpecial(){
            return danio;}
}
