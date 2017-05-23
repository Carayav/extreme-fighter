package Strategys;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renenoel
 */
public class IAgil extends Strategy { 
        
     @Override
    public int getDanio(){
       return danio;
    }       
    
    @Override
    public String AtaqueSpecial(){
        return "ataque agil";
    }
    
    
}
