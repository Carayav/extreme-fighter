package Person;

import Strategies.*;

public class GorrionDeConchali extends Luchador{
    
    public GorrionDeConchali(){
        Init("GORRION DE CONCHALI!!!!", "agil", new IAgil());
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
    public int danioSpecial(){
        return danio;
    }   
}
