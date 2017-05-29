package Strategies;

public class IMago extends Strategy { 
    
    public IMago() {
        this.danio = 50;
    }
    
    @Override
    public int getDanio(){
       return danio;
    }
    
    @Override
    public String AtaqueSpecial(){
        return "ataque magico";
    }
}

