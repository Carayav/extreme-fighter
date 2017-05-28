package Apoyo;

import Person.Luchador;

public abstract class Apoyo extends Luchador{
    
    protected int danioSuper;
    protected Luchador luchador;    
    private final String strSpecial = "NadaSuper";
    
    @Override
    public String getSpecialString(){
        return strSpecial;
    };    
    @Override
    public String golpear() { 
	return luchador.golpear();
	}  
    @Override
    public String saltar() {
        return luchador.saltar();
    }
    @Override
    public String patear(){
        return luchador.patear();
    }
    @Override
    public abstract int danioSpecial();
}
