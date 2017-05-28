package Apoyo;

import Strategys.Luchador;

public class Tarro extends Apoyo { 
    
    public Tarro(Luchador luchador){
        this.luchador = luchador;
        this.danioSuper = 25;
    }
        
    public String getSpecialString() {
        return luchador.getSpecialString() + " Especial Tarro";
    }

    public int danioSpecial() {
        return luchador.danioSpecial() + danioSuper;
    }
    public void Init() { throw new UnsupportedOperationException();}

}
