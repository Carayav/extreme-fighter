package Person;

import Strategies.*;

public class MineroWarrior extends Luchador{
    
    public MineroWarrior(){
        Init("Minero Warrior", "fuerte", new IFuerte() );
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
    public int danioSpecial(){
        return danio;
    }
}
