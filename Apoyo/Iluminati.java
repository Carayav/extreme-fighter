package Apoyo;

import Strategys.Luchador;

public class Iluminati extends Apoyo{        
    
    private int danioSuper = 40;
    
    public Iluminati(Luchador luchador){
        this.luchador = luchador;
    }
    
    public String getSpecialString() {
        return luchador.getSpecialString() + " Especial Illuminati";
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
