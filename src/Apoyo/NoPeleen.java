package Apoyo;

import Person.Luchador;

public class NoPeleen extends Apoyo{
    
    public NoPeleen(Luchador luchador){
        this.luchador = luchador;
        this.danioSpecial = 30;
    }
    
    @Override
    public String getSpecialString() {
        return luchador.getSpecialString() + " Especial NoPeleen";
    }
        
    @Override
    public int danioSpecial() {
        return luchador.danioSpecial() + danioSpecial;
    }
    
}

