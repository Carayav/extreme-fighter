package Person;

import Strategies.*;

public class ChoroPortenho extends Luchador {
    
    public ChoroPortenho(){
        Init("Choro Portenho", "mago", new IMago());
    }
    
    @Override
    public String golpear(){
        return("ALETAZO MARINO!!!");
    }

    @Override
    public String patear(){
        return("PATADA DE LA JAIBAAAAA!!!");
    }
    
    @Override
    public String saltar(){
        return("PIQUERO INFERNAAAAAL!!!");
    }

    @Override
    public int danioSpecial(){
        return danio;
    }
}
