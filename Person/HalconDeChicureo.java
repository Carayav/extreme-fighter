package Person;


import Strategys.Luchador;
import Strategys.IAgil;

public class HalconDeChicureo extends Luchador{
    
	public HalconDeChicureo(){
            Init();
        }
	@Override
	public String golpear(){
		return("BRAZO BOOMERANG!!!");
	}
	
	@Override
        public String patear(){
		return("PATADA DE BIEN LEJOS!!!");
	}

	@Override
        public String saltar(){
		return("SALTO DEL AVION!!!");
	}
        
        public void Init(){
            this.setNombre("HALCON DE CHICUREO!!!!");
            this.setTipo("agil");    
            this.strategy = new IAgil();
            this.danio = this.strategy.getDanio();
        }
        
        
        public int danioSpecial(){
            return danio;
        }
        

}
