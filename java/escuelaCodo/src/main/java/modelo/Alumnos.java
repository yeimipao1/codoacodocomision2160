package modelo;

public class Alumnos {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int fecha;
    private String provincia;

    public Alumnos(int id, String nombre, String apellido, String edad, String fecha, String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
    public Alumnos (int id,String nombre,String apellido,int edad,int fecha,String provincia){
    this.id=id;
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.fecha=fecha;
    this.provincia=provincia;
    
    }
    
    
    
    
    
}
