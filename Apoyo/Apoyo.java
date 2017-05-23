package Apoyo;

import Strategys.Luchador;

public abstract class Apoyo extends Luchador{
    
    public Luchador luchador;
    public String strSpecial = "NadaSuper";
    
    public String getSpecialString(){
        return strSpecial;
    };

    public abstract int danioSpecial();
}
