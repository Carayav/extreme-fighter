package Person;

import Strategies.*;

public class PanchoDelSur extends Luchador {
    
    public PanchoDelSur(){
        Init("PANCHO DEL SUR!!!!", "fuerte", new IFuerte());
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
    public int danioSpecial(){
        return danio;
    }
}
