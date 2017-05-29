package Apoyo;

import Person.Luchador;

public class Iluminati extends Apoyo{        
    
    public Iluminati(Luchador luchador){
        this.luchador = luchador;
        this.danioSpecial = 40;
    }
    
    @Override
    public String getSpecialString() {
        return luchador.getSpecialString() + " Especial Illuminati";}
    
    @Override
    public int danioSpecial() {
        return luchador.danioSpecial() + danioSpecial;}
}
