package esculadigital;

import alumnos.Alumnos;
import docente.Docente;


public class EsculaDigital {

    public static void main(String[] args) {
       Docente docente1 = new Docente(12,"Yeimi","Navarrete",33);
       Alumnos alumnos = new Alumnos(14,"Pedro","Hernandez",25,10);
       Campus campus =new Campus(14,"web");
       campus.setPassword ("123456");
       Campus docente = new Campus(12,"web");
       docente.setPassword("456789");
       System.out.println(docente.ingresar(12, "456789"));
    }
    
}
