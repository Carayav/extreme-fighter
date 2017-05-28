package Strategies;

public class IFuerte extends Strategy { 
    
    private final int danio = 100;
    
    @Override
    public int getDanio(){
       return danio;}     
    
    @Override
    public String AtaqueSpecial(){
        return "ataque fooorte";}   
    
}

