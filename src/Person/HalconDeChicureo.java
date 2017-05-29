package Person;

import Strategies.*;

public class HalconDeChicureo extends Luchador{
    
    public HalconDeChicureo(){
        Init("HALCON DE CHICUREO!!!!", "agil", new IAgil());
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
    
    @Override
    public int danioSpecial(){
        return danio;
    }
}
