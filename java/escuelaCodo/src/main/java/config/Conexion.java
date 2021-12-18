package config;
import java.sql.*;

public class Conexion {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection(){
    Connection c = null;
    try{
    Class.forName(driver);
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tarea obligatoria unidad n°11","yeimipao1", "123456");
    }catch(ClassNotFoundException | SQLException error){
        System.out.println(error.toString());
    }
    return c;
    }
    public static void main (String[] lelis) throws SQLException {
    Connection conexion = null;
    Conexion con = new Conexion();
    conexion = con.getConection();
    
    
    PreparedStatement ps;
    ResultSet rs;
    ps = conexion.prepareStatement("SELECT * FROM participantes");
    rs = ps.executeQuery();
    while(rs.next ()){
        int id = rs.getInt("id");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        int edad = rs.getInt("edad");
        int fecha = rs.getInt("fecha");}
        String provincia = rs.getString("provincia");
        System.out.println("Id: " + id + "Nombre: " + nombre + "Apellido: "+ apellido + "Edad: " + edad + "Fecha: " + fecha + "Provincia: " + provincia +);
    
    }
    
    }

