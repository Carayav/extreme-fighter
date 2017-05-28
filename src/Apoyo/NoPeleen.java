package Apoyo;

import Person.Luchador;

public class NoPeleen extends Apoyo{
    
    public NoPeleen(Luchador luchador){
        this.luchador = luchador;
        this.danioSuper = 30;
    }
    
    public String getSpecialString() {
        return luchador.getSpecialString() + " Especial NoPeleen";
    }
        
    public int danioSpecial() {
        return luchador.danioSpecial() + danioSuper;
    }
    
}

