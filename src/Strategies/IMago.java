package Strategies;

public class IMago extends Strategy { 
    
    private final int danio = 50;
    
    @Override
    public int getDanio(){
       return danio;} 
    
    @Override
    public String AtaqueSpecial(){
        return "ataque magico";}
}

