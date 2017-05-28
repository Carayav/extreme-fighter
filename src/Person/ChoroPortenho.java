package Person;

import Strategys.Luchador;
import Strategys.IMago;

public class ChoroPortenho extends Luchador {       
        
    
        public ChoroPortenho(){            
            Init();
        }
        
        public String golpear(){
		return("ALETAZO MARINO!!!");
	}
	
        public String patear(){
		return("PATADA DE LA JAIBAAAAA!!!");
	}
	
        public String saltar(){
		return("PIQUERO INFERNAAAAAL!!!");
	}

        public void Init(){
            this.strategy = new IMago();
            this.setNombre("Choro Portenho");
            this.setTipo("mago"); 
            this.danio = this.strategy.getDanio();
        }
                
        public int danioSpecial(){
            return danio;
        }

        

}
