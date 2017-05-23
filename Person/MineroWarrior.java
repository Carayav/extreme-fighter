package Person;


import Strategys.Luchador;
import Strategys.IFuerte;


public class MineroWarrior extends Luchador{
        public MineroWarrior(){
            Init();
        }

	
        @Override
        public String golpear(){
		return("PUÑO DEL PIRQUINEROOOO!!!");
	}
	
        @Override
	public String patear(){
		return("PATADA DEL CATEADOOOOOOR!!!");
	}
        
        @Override
	public String saltar(){
		return("SALTO EXPLOSIVOOOOO!!!");
	}
        @Override
        public void Init(){
            this.strategy = new IFuerte();
            this.setNombre("Minero Warrior");
            this.setTipo("fuerte");
            this.danio = this.strategy.getDanio();
        }
                
        public int danioSpecial(){
            return danio;
        }

}
