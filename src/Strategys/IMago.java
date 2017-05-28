package Strategys;

public class IMago extends Strategy { 
    public int danio = 50;
    @Override
    public int getDanio(){
       return danio;
    } 
    
    @Override
    public String AtaqueSpecial(){
        return "ataque magico";
    }
}

