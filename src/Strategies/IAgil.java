package Strategies;

public class IAgil extends Strategy { 

    private final int danio = 75;

    @Override
    public int getDanio(){
       return danio;
    }       
    
    @Override
    public String AtaqueSpecial(){
        return "ataque agil";
    }
    
    
}
