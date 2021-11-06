package mi_primer_aplicacion;

public class Juego {
    public  int puntos,vidas;
    public String personaje,enemigos,aliados;
    Juego(int puntos, int vidas, String personaje,String enemigos,String aliados){
        this.puntos=puntos;
        this.vidas=vidas;
        this.personaje=personaje;
        this.enemigos=enemigos;
        this.aliados=aliados;
        
    }
    String mostrarSaludo(){
        
      return "Hola soy: "+this.personaje + " y tengo "+this.vidas + "Vidas!";
    }
}
