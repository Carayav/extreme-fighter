package Strategies;

public class IAgil extends Strategy { 

    public IAgil() {
        this.danio = 75;
    }

    @Override
    public int getDanio(){
       return danio;
    }       
    
    @Override
    public String AtaqueSpecial(){
        return "ataque agil";
    }
    
    
}
