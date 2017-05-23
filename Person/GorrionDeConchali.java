package Person;


import Strategys.Luchador;
import Strategys.IAgil;

public class GorrionDeConchali extends Luchador{
	         
        public GorrionDeConchali(){
            Init();            
        }    
    
	@Override
        public String golpear(){
		return("PUÑO CEBOLLERO!!!");
	}
	
        @Override
	public String patear(){
		return("PATADA LACRIMOGENA!!!");
	}

        @Override
	public String saltar(){
		return("PIQUERO ROMANTICO!!!");
	}
        @Override
        public void Init(){
            this.strategy = new IAgil();
            this.setNombre("GORRION DE CONCHALI!!!!");		
            this.setTipo("agil");		
            this.danio = this.strategy.getDanio();
        }
                
        public int danioSpecial(){
            return danio;
        }
        
        
}
