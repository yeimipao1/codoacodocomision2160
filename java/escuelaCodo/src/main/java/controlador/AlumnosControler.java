package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Alumnos;
import modelo.AlumnosDAO;


@WebServlet(name = "AlumnosControler", urlPatterns = {"/AlumnosControler"})
public class AlumnosControler extends HttpServlet {

    
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            AlumnosDAO alumnosDAO = new AlumnosDAO();
            String accion;
            RequestDispatcher dispatcher = null;
            accion = request.getParameter("accion");
            if(accion == null || accion.isEmpty()){
                dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
                
            }else if(accion.equals("modificar")){
            dispatcher = request.getRequestDispatcher("Vistas/modificar.jsp");
            }else if(accion.equals("actualizar")){
                int id = Integer.parseInt(request.getParameter("id"));
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String edad = request.getParameter("edad");
                String fecha = request.getParameter("fecha");
                String provincia = request.getParameter("provincia");
                Alumnos alumno = new Alumnos(id,nombre,apellido,edad,fecha,provincia);
                alumnosDAO.actualizarAlumno(alumno);
                dispatcher = request.getRequestDispatcher("Vistas/alumnos.jsp");
            }
            dispatcher.forward(request, response);
    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
