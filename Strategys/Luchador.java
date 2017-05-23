package Strategys;

public abstract class Luchador {
    	private String nombre = new String();
        private String tipo = new String();
        public Strategy strategy = null;
        
        public int danio = 50;        
                
        public abstract String golpear();	
	public abstract String patear();
	public abstract String saltar();        
        public abstract void Init();	          
        public abstract int danioSpecial();
        
        public String getNombre(){
            return this.nombre;}
        public void setNombre(String nuevoNombre){
            this.nombre=nuevoNombre;}
        
        public String getTipo(){
            return this.tipo;}
        public void setTipo(String nuevoTipo){
            this.tipo=nuevoTipo;}
    
        public void setStrategy(Strategy strategy){
            this.strategy = strategy;}        
        public String getSpecialString(){
            return strategy.AtaqueSpecial();}    
}
