package Apoyo;

import Strategys.Luchador;

public class Iluminati extends Apoyo{        
    
    public Iluminati(Luchador luchador){
        this.luchador = luchador;
        this.danioSuper = 40;
    }
    
    public String getSpecialString() {
        return luchador.getSpecialString() + " Especial Illuminati";
    }
    
    public int danioSpecial() {
        return luchador.danioSpecial() + danioSuper;
    }
    
    public void Init() { throw new UnsupportedOperationException();}    
}
