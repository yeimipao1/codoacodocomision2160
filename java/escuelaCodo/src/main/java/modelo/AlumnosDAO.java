package modelo;

import config. Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnosDAO {
    Connection conexion;
    public AlumnosDAO (){
    Conexion con = new Conexion();
    conexion = con.getConection();
    }
    public List<Alumnos> listarAlumnos(){
    PreparedStatement ps;
    ResultSet rs;
    List<Alumnos> lista = new ArrayList<>();
    /*List es abstrata*/
    try{
        ps = conexion.prepareStatement("SELECT * FROM participantes");
        rs = ps.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id");
            String  nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            int edad = rs.getInt("edad");
            int fecha = rs.getInt("fecha");
            String provincia= rs.getString("provincia");
            Alumnos alumnos = new Alumnos(id, nombre, apellido, edad, fecha, provincia);
            lista.add(alumnos);
        }
        return lista;
        
    }catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    
    }
    public Alumnos mostrarAlumno(int _id){
    PreparedStatement ps;
    ResultSet rs;
    Alumnos alumno = null;
    try{
        ps = conexion.prepareStatement("SELECT * FROM participantes WHERE id=?");
        ps.setInt(1,_id);
        rs = ps.executeQuery();
        
         while(rs.next()){
            int id = rs.getInt("id");
            String  nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            int edad = rs.getInt("edad");
            int fecha = rs.getInt("fecha");
            String provincia= rs.getString("provincia");
            
            alumno = new Alumnos(id,nombre,apellido,edad,fecha,provincia);
        } return alumno;
        
    }catch(SQLException e){ 
        System.out.println(e.toString());
        return null;
    }
    }
    public boolean insertarAlumno(Alumnos alumno){
        PreparedStatement ps;
        
    try{
            ps = conexion.prepareStatement ("INSERT INTO participantes"
                    +"(nombre,apellido,edad,fecha,provincia)"
                    +"VALUES (?,?,?,?,?)");
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3,alumno.getEdad());
            ps.setInt(4,alumno.getFecha());
            ps.setString(5,alumno.getProvincia());
            ps.execute();
            return true;
        }catch(SQLException e){ 
            System.out.println(e.toString());
            return false;
        }
        
    }
    public boolean actualizarAlumno(Alumnos alumno){
      PreparedStatement ps;
        
    try{
            ps = conexion.prepareStatement ("UPDATE" 
                    +"participantes SET nombre=?"
                    +"apellido=? edad=?"
                    +"fecha=? provincia=?)"
                    +"WHERE id=?");
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3,alumno.getEdad());
            ps.setInt(4,alumno.getFecha());
            ps.setString(5,alumno.getProvincia());
            ps.execute();
            return true;
        }catch(SQLException e){ 
            System.out.println(e.toString());
            return false;
        }  
    }
    public boolean eliminarAlumno(int _id){
        PreparedStatement ps;
         try{
        ps = conexion.prepareStatement("DELETE FROM participantes WHERE id=?");
        ps.setInt(1,_id);
        ps.execute();
        return true;
    }catch(SQLException e){
             System.out.println(e.toString());
             return false;
    }
}
}
