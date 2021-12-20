<%-- 
    Document   : modificar
    Created on : 17/12/2021, 10:36:45 p. m.
    Author     : familia
--%>

<%@page import="modelo.AlumnosDAO"%>
<%@page import="modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Alumnos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            int mid;
            mid= Integer.parseInt(id);
            Alumnos resultado=null;
            AlumnosDAO alumnosDAO = new AlumnosDAO();
            resultado = alumnosDAO.mostrarAlumno(mid);
                                   
        %>
        <h1 class="text-center">Modificar Alumno</h1>
        <div class="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosControler?accion=actualizar" method="GET">
                     <div class="mb-3">
                        <label for="id" class="form-label"></label>
                        <input type="hidden" class="form-control" id="id" name="id" 
                               value="<%= resultado.getId()%>"/>
                    </div>
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre</label>
                        <input type="text" class="form-control" id="nombre" name="nombre" 
                               value="<%= resultado.getNombre()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="apellido" class="form-label">Apellido</label>
                        <input type="text" class="form-control" id="apellido" name="apellido" 
                               value="<%= resultado.getApellido()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="edad" class="form-label">Edad</label>
                        <input type="text" class="form-control" id="edad" name="edad" 
                               value="<%= resultado.getEdad()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="fecha" class="form-label">Fecha</label>
                        <input type="text" class="form-control" id="fecha" name="fecha" 
                               value="<%= resultado.getFecha()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="provincia" class="form-label">Provincia</label>
                        <input type="text" class="form-control" id="provincia" name="provincia" 
                               value="<%= resultado.getProvincia()%>" />
                    </div>
                    <button type="submit" class="btn btn-primary">Modificar</button>
                </form>
                
            </div>
        </div>
    </body>
</html>
