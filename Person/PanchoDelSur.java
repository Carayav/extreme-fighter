package Person;


import Strategys.Luchador;
import Strategys.IFuerte;

public class PanchoDelSur extends Luchador {
	
        public PanchoDelSur(){
            Init();
	}
        @Override
	public String golpear(){
		return("PUÑO DEL HOCICON!!!");
	}
	@Override
	public String patear(){
		return("PATADA SATELITEEE!!!");
	}
    
        @Override
	public String saltar(){
		return("JOJOI!!!");
	}
        
        @Override
        public void Init(){
            this.strategy = new IFuerte();
            this.setNombre("PANCHO DEL SUR!!!!");
            this.setTipo("fuerte");  
            this.danio = this.strategy.getDanio();            
        }        
        
        
        public int danioSpecial(){
            return danio;
        }

}
