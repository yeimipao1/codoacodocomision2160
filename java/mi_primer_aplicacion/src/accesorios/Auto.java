package accesorios;


public class Auto {
    public int velocidad;
    private boolean encendido;
    public int capPasajeros;
    public String color,modelo,año,patente;

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    public Auto(int velocidad,int capPasajeros, String color, String modelo,String año,String patente){
        this.velocidad=velocidad;
        this.capPasajeros=capPasajeros;
        this.color=color;
        this.modelo=modelo;
        this.año=año;
        this.patente=patente;
    
    
    }
    public boolean encender_auto(){
    if(this.isEncendido()){
        System.out.println("El auto está encendido!!");
       return false;
      }else {
        System.out.println("El auto esta encendiendo");
        return true;}
    }
}
