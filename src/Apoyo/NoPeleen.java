package Apoyo;

import Strategys.Luchador;

public class NoPeleen extends Apoyo{
    
    private int danioSuper = 30;
    
    public NoPeleen(Luchador luchador){
        this.luchador = luchador;
    }
    
    public String getSpecialString() {
        return luchador.getSpecialString() + " Especial NoPeleen";
    }
        
    public int danioSpecial() {
        return luchador.danioSpecial() + danioSuper;
    }

    @Override
    public String golpear() { throw new UnsupportedOperationException();}
    @Override
    public String patear() { throw new UnsupportedOperationException();}
    @Override
    public String saltar() { throw new UnsupportedOperationException();}
    @Override
    public void Init() { throw new UnsupportedOperationException();}
    
}

