package Apoyo;

import Person.Luchador;

public class Tarro extends Apoyo { 
    
    public Tarro(Luchador luchador){
        this.luchador = luchador;
        this.danioSpecial = 25;
    }
        
    @Override
    public String getSpecialString() {
        return luchador.getSpecialString() + " Especial Tarro";
    }
    
    @Override
    public int danioSpecial() {
        return luchador.danioSpecial() + danioSpecial;
    }    
}
